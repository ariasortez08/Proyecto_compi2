package Semantic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Pascal.pascalLexer;
import Pascal.pascalParser;
import Pascal.pascalBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SemanticAnalyzer extends pascalBaseVisitor<Void> {
    private SymbolTable symbolTable = new SymbolTable();
    private int currentScope = 0;
    private int funcparams = 0;
    private int arreglosconter = 0;
    private String Funcname2 = "";
    private int conterWhile = 0;
    private int conterWhileload = 0;
    private int conterifs = 0;
    private int conterifslabes = 0;
    private int countermsg = 0;
    private int counterread = 0;
    private int counterexpre;
    private int counteload = 0;
    private int counterforload = 0;
    private int counterforloops = 0;

    private int ftmci = 0;
    private String codigo_LLVM;
    private String exprecionVar;
    private String coddigoexpresion;
    private String codigo_LLVMmain;

    private String codigo_LLVMfunciones;
    private List<String> errors = new ArrayList<>(); // Lista para almacenar errores

    @Override
    public Void visitVarDecl(pascalParser.VarDeclContext ctx) {
        String varName = ctx.varID().getText();
        String varType = ctx.typeDef().getText();
        boolean funcion = true;
        String nameFunction = ctx.getParent().getParent().getText();
        String functionName = "";
        Symbol symbol;

        if(ctx.getParent().getParent().getText().toLowerCase().contains("program"))
        {
            funcion = false;
        }else
        {
            int start = nameFunction.indexOf("function") + 9; // Saltar la palabra "function"
            int end = nameFunction.indexOf("(", start); // Buscar el paréntesis de apertura
            functionName = nameFunction.substring(start, end).trim();
            funcion = true;

        }


        if(varName.contains(","))
        {
            String[] varArray = varName.split(",");
            for (String varNames : varArray) {

                symbolTable.addSymbol(varNames, varType, currentScope);
                symbol = symbolTable.lookup(varNames);

                if (funcion)
                {
                    symbol.setPertfunction(functionName);

                }



            }
        }else
        {
            symbolTable.addSymbol(varName, varType, currentScope);
            symbol = symbolTable.lookup(varName);
            if (funcion)
            {
                symbol.setPertfunction(functionName);

            }

        }



        //codigo llvm

        if(varType.toLowerCase().equals("integer")) {
            //ejemplo :: %x = alloca i32                ; Reserva espacio en la pila para la variable x


            if(varName.contains(","))
            {
                String[] varArray = varName.split(",");
                for (String varNames : varArray) {
                    if(funcion)
                    {
                        codigo_LLVMfunciones += "\n\t%"+varNames + " = alloca i32";
                        funcparams++;
                    }else {
                        codigo_LLVMmain += "\n\t%" + varNames + " = alloca i32";
                    }
                }
            }else
            {
                if(funcion) {
                    codigo_LLVMfunciones += "\n\t%" + varName + " = alloca i32";
                    funcparams++;
                }else {
                    codigo_LLVMmain += "\n\t%" + varName + " = alloca i32";
                }
            }

        }else if(varType.toLowerCase().equals("boolean"))
        {
            //%bool_var = alloca i1                ; Reserva espacio para una variable de tipo bool (1 bit)


            if(varName.contains(","))
            {
                String[] varArray = varName.split(",");
                for (String varNames : varArray) {
                    if(funcion) {
                        codigo_LLVMfunciones += "\n\t%" + varNames + " = alloca i1";
                        funcparams++;
                    }else {
                        codigo_LLVMmain += "\n\t%" + varNames + " = alloca i1";
                    }
                }
            }else
            {
                if(funcion) {
                    codigo_LLVMfunciones += "\n\t%" + varName + " = alloca i1";
                }else {
                    codigo_LLVMmain += "\n\t%" + varName + " = alloca i1";
                }
            }
        } else if(varType.toLowerCase().equals("char"))
        {
            //%char_var = alloca i8                 ; Reserva espacio para una variable de tipo char (1 byte)

            if(varName.contains(","))
            {
                String[] varArray = varName.split(",");
                for (String varNames : varArray) {
                    if(funcion) {
                        codigo_LLVMfunciones += "\n\t%" + varNames + " = alloca i8";
                    }else {
                        codigo_LLVMmain += "\n\t%" + varNames + " = alloca i8";
                    }
                }
            }else
            {
                if(funcion) {
                    codigo_LLVMfunciones += "\n\t%" + varName + " = alloca i8";
                }else {
                    codigo_LLVMmain += "\n\t%" + varName + " = alloca i8";
                }
            }
        } else if(varType.toLowerCase().equals("string"))
        {

        } else
        {

            if(varType.toLowerCase().contains(","))
            {
                 //bidi
                //conseguir los cuatro numeros
                //@arr_bidi = global [10 x [5 x i32]] zeroinitializer  ; Arreglo bidimensional de 10x5 enteros
                String range2= ctx.typeDef().typeName().arrDecl().arr2D().range(1).getText();
                String range4= ctx.typeDef().typeName().arrDecl().arr2D().range(3).getText();
                String Type=ctx.typeDef().typeName().arrDecl().arr2D().typearray().getText();
                String ChangType = Type;
                if(Type.toLowerCase().equals("integer"))
                {
                    Type = "i32";
                } else if (Type.toLowerCase().equals("char")) {
                    Type = "i8";
                }else {
                    Type = "i1";
                }

                if(varName.contains(","))
                {
                    String[] varArray = varName.split(",");
                    for (String varNames : varArray) {
                        Symbol sybol = symbolTable.lookup(varNames);
                        sybol.setType(ChangType);
                        String rangos = range2+ ","+range4;
                        sybol.setRanges(rangos);

                        codigo_LLVM += "\n@"+varNames + " = global ["+range2+" x ["+range4+" x "+Type+"]] zeroinitializer";
                    }
                }else
                {
                    Symbol sybol = symbolTable.lookup(varName);
                    sybol.setType(ChangType);
                    String rangos = range2+ ","+range4;
                    sybol.setRanges(rangos);
                    codigo_LLVM += "\n@"+varName + " = global ["+range2+" x ["+range4+" x "+Type+"]] zeroinitializer";
                }

            }else
            {
                //normal
                //@arr = global [50 x i32] zeroinitializer   ; Arreglo unidimensional de 50 enteros
                String range1 = ctx.typeDef().typeName().arrDecl().arr1D().range(0).getText();
                String range2= ctx.typeDef().typeName().arrDecl().arr1D().range(1).getText();
                String Type=ctx.typeDef().typeName().arrDecl().arr1D().typearray().getText();
                String ChangType= Type;
                if(Type.toLowerCase().equals("integer"))
                {
                    Type = "i32";
                } else if (Type.toLowerCase().equals("char")) {
                    Type = "i8";
                }else {
                    Type = "i1";
                }
                if(varName.contains(","))
                {
                    String[] varArray = varName.split(",");
                    for (String varNames : varArray) {
                        Symbol sybol = symbolTable.lookup(varNames);
                        sybol.setType(ChangType);
                        String rangos = range2;
                        sybol.setRanges(rangos);
                        codigo_LLVM += "\n@"+varNames + " = global ["+range2+" x "+Type+"] zeroinitializer";
                    }
                }else
                {
                    Symbol sybol = symbolTable.lookup(varName);
                    sybol.setType(ChangType);
                    String rangos = range2;
                    sybol.setRanges(rangos);
                    codigo_LLVM += "\n@"+varName + " = global ["+range2+" x "+Type+"] zeroinitializer";
                }

            }
        }


        return null;
    }

    @Override
    public Void visitConstDecl(pascalParser.ConstDeclContext ctx)
    {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }

    public Void visitConstCharDecl(pascalParser.ConstCharDeclContext ctx)
    {
        //CONST_CHAR COLON ID EQUAL TEXT SEMI_COLON
        //@constchar = constant i8 97                ; Constante de carácter (ASCII de 'a')
        char c = ctx.TEXTCHAR().getText().charAt(0);  // Extraer el primer (y único) carácter de la cadena
        int asciiValue = (int) c;  // Obtener el valor ASCII del carácter
        codigo_LLVM += "\n@"+ctx.ID().getText()+" = constant i8 " +asciiValue;
        return null;
    }

    public Void visitConstStrDecl(pascalParser.ConstStrDeclContext ctx)
    {
        //CONST_STRING COLON ID EQUAL TEXT SEMI_COLON;
        ////@conststr = constant [5 x i8] c"HOLA\00"   ; Constante de cadena con terminador nulo
        String texto = ctx.TEXT().getText();
        texto = texto.replace("'", "");
        int size = texto.length() + 1;
        codigo_LLVM += "\n@"+ctx.ID().getText()+" = constant ["+size+" x i8] c\""+texto+"\\00\"";
        return null;
    }

    public Void visitFunctionBlock(pascalParser.FunctionBlockContext ctx){
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }
    @Override
    public Void visitFunctionDecl(pascalParser.FunctionDeclContext ctx)
    {
        String varName = String.valueOf(ctx.ID());
        String varType = ctx.returnType().getText();
        for (TerminalNode idNode : ctx.ID()) {
            varName = idNode.getText(); // Esto debería darte el texto del token
        }
        Symbol symbol = symbolTable.lookup(varName);
        if(symbol != null)
        {
            if(symbol.getFunction())
            {
                errors.add("Error: Funcion existente con nombre "+ varName + " en la linea " + ctx.start.getLine());
            }else
            {
                errors.add("Error: Variable existente con nombre "+ varName + " en la linea " + ctx.start.getLine());
            }

            return null;
        }
        symbolTable.addSymbol(varName, varType, currentScope);
        symbol = symbolTable.lookup(varName);
        symbol.setFunction(true);


        if(varType.toLowerCase().equals("integer"))
        {
            //integer
            varType = "i32";
        }else if (varType.toLowerCase().equals("boolean"))
        {
            //boolean
            varType = "i1";

        }else if(varType.toLowerCase().equals("char"))
        {
            //char
            varType = "i8";
        }else
        {
            //string
        }
        Funcname2 = varName;
        if(ctx.getChild(2).getText().contains("var"))
        {
            codigo_LLVMfunciones += "\ndefine "+varType+" @"+varName+"(";
            currentScope++;
            visitChildren(ctx);
            symbolTable.removeSymbolsInScope(currentScope);
            currentScope--;
        }else
        {
            codigo_LLVMfunciones += "\ndefine "+varType+" @"+varName+"() {\n" +
                    "entry:\n";
            currentScope++;
            visitChildren(ctx);
            symbolTable.removeSymbolsInScope(currentScope);
            currentScope--;
        }

        codigo_LLVMfunciones += "\n}";
        funcparams = 0;
        Funcname2 ="";
        return null;
    }

    @Override
    public Void visitFuctionUsage(pascalParser.FuctionUsageContext ctx)
    {
        String name = ctx.ID().getText();


        int params = 0;
        for (Map.Entry<String, Symbol> entry : symbolTable.getSymbols().entrySet()) {
            String key = entry.getKey();
            Symbol value = entry.getValue();

            if(value.getPertfunction() != null && value.getPertfunction().toLowerCase().equals(name))
            {
                params++;
            }
        }

        String[] paramsbueno =  new String[params];
        params = 0;
        for (Map.Entry<String, Symbol> entry : symbolTable.getSymbols().entrySet()) {
            String key = entry.getKey();
            Symbol value = entry.getValue();

            if(value.getPertfunction() != null && value.getPertfunction().toLowerCase().equals(name))
            {
                paramsbueno[params] = value.getType();
                params++;
            }
        }


        if(params == 1 && ctx.paramsusable() == null)
        {
            errors.add("Error: La funcion "+ name + " necesita " +params +" parametros, pero se le estan dando 0 en la linea "+ ctx.start.getLine());
            return null;
        }
        if(ctx.paramsusable() != null)
        {

            String paramsstring = ctx.paramsusable().getText();
            if(paramsstring.contains(","))
            {
                String[] cantiparams = paramsstring.split(",");
                if(cantiparams.length != params)
                {
                    errors.add("Error: La funcion "+ name + " necesita " +params +" parametros, pero se le estan dando "+cantiparams.length +" en la linea "+ ctx.start.getLine());
                    return null;
                }
                Symbol symbol;
                for (int  i =0; i < params; i++)
                {
                    symbol = symbolTable.lookup(cantiparams[i]);
                    if(symbol == null)
                    {
                        errors.add("Error: el parametro "+cantiparams[i]+" no esta declarado en la linea "+ ctx.start.getLine());
                        return null;
                    }
                    if(paramsbueno[i].toLowerCase().equals(symbol.getType().toLowerCase()))
                    {

                    }else
                    {
                        errors.add("Error: el parametro esperaro era de tipo "+paramsbueno[i].toLowerCase()+" pero se recibio "+symbol.getType()+" en la linea "+ ctx.start.getLine());
                        return null;
                    }

                }


            }else
            {
                if( params != 1)
                {
                    errors.add("Error: La funcion "+ name + " necesita " +params +" parametros, pero se le estan dando 1 en la linea "+ ctx.start.getLine());
                    return null;
                }
                Symbol symbol = symbolTable.lookup(ctx.paramsusable().getText());
                if(symbol == null)
                {
                    errors.add("Error: el parametro "+ctx.paramsusable().getText()+" no esta declarado en la linea "+ ctx.start.getLine());
                    return null;
                }
                if(paramsbueno[0].toLowerCase().equals(symbol.getType().toLowerCase()))
                {

                }else
                {
                    errors.add("Error: el parametro esperaro era de tipo "+paramsbueno[0].toLowerCase()+" pero se recibio "+symbol.getType()+" no esta declarado en la linea "+ ctx.start.getLine());
                    return null;
                }

            }
        }

        return null;
    }

    public Void visitVarParamBlock(pascalParser.VarParamBlockContext ctx)
    {

        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        codigo_LLVMfunciones += ") {\n" +
                "entry:\n";
        return null;
    }
    public Void visitVarParamDecl(pascalParser.VarParamDeclContext ctx)
    {
        //define i32 @f(i32 %x) {
        currentScope++;
        currentScope++;
        currentScope++;
        String varname = ctx.varParamID().getText();
        String vartype = ctx.typeParamDef().getText();
        String vartypename = vartype;
        if(vartype.toLowerCase().equals("integer"))
        {
            vartype = "i32";
        } else if (vartype.toLowerCase().equals("boolean")) {
            vartype = "i1";

        }else if(vartype.toLowerCase().equals("char"))
        {
            vartype = "i8";
        }else
        {

        }
        Symbol symbol;
        if(varname.contains(","))
        {
            String newname= "";
            String[] varArray = varname.split(",");
            for (String varNames : varArray) {
                newname = varNames+"_"+Funcname2;

                symbol = symbolTable.lookup(newname);
                if(symbol != null)
                {
                    errors.add("Error: Variable ya declarada como parametro "+ varNames + " en la linea " + ctx.start.getLine());
                    return null;
                }
                symbolTable.addSymbol(newname, vartypename, 59);
                symbol = symbolTable.lookup(newname);
                symbol.setPertfunction(Funcname2);


                codigo_LLVMfunciones += vartype+ " %"+ varNames +", ";
                funcparams++;
            }
            codigo_LLVMfunciones = codigo_LLVMfunciones.substring(0, codigo_LLVMfunciones.length() - 2);
        }else
        {
            funcparams++;
            String newname = varname+"_"+Funcname2;
            symbol = symbolTable.lookup(newname);
            if(symbol != null)
            {
                errors.add("Error: Variable ya declarada como parametro "+ varname + " en la linea " + ctx.start.getLine());
                return null;
            }
            symbolTable.addSymbol(newname, vartypename, 59);
            symbol = symbolTable.lookup(newname);
            symbol.setPertfunction(Funcname2);
            codigo_LLVMfunciones += vartype+ " %"+ varname;
        }
        currentScope++;
        return null;
    }

    @Override
    public Void visitStatements(pascalParser.StatementsContext ctx)
    {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }
    @Override
    public Void visitTypesstatemes(pascalParser.TypesstatemesContext ctx)
    {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }

    @Override
    public Void visitSentence(pascalParser.SentenceContext ctx) {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }
    @Override
    public Void visitAssign(pascalParser.AssignContext ctx) {
        //semantica
        //revisar el tipo de ctx.expression() y asi revisar que tipo es
        String varName = ctx.assingId().getText();
        String posicion1 = "";
        String posicion2 = "";
        boolean arregloN = false;
        boolean arregloB = false;
        String caoposicion ="";
        String caoposicion2 ="";

        if(varName.contains("["))
        {
            if(varName.contains(",")){
                arregloB =true;
                posicion1 = varName.split("\\[")[1];
                posicion2 = posicion1.split(",")[1];
                posicion2 = posicion2.split("]")[0];
                posicion1 = posicion1.split(",")[0];

                if(ctx.assingId().arraybi_call().arraybi1().ID()!= null)
                {
                    Symbol symbol3 = symbolTable.lookup(posicion1);
                    if(symbol3 == null){
                        errors.add("Error: Variable '" + posicion1 + "' no declarada en la línea " + ctx.start.getLine());
                        return null;
                    }
                    caoposicion += "\n\t%"+posicion1+"_val"+arreglosconter+" = load i32, i32* %"+posicion1 ;
                    posicion1 = "%"+ posicion1+"_val"+arreglosconter;
                }
                if(ctx.assingId().arraybi_call().arraybi2().ID()!= null)
                {
                    Symbol symbol4 = symbolTable.lookup(posicion2);
                    if(symbol4 == null){
                        errors.add("Error: Variable '" + posicion2 + "' no declarada en la línea " + ctx.start.getLine());
                        return null;
                    }
                    caoposicion += "\n\t%"+posicion2+"_val"+arreglosconter+" = load i32, i32* %"+posicion2 ;
                    posicion2 = "%"+ posicion2+"_val"+arreglosconter;
                }

            }else
            {
                arregloN = true;
                posicion1 = varName.split("\\[")[1];
                posicion1 = posicion1.split("]")[0];

                if(ctx.assingId().array_call().arraybi1().ID()!= null)
                {
                    Symbol symbol5 = symbolTable.lookup(posicion1);
                    if(symbol5 == null){
                        errors.add("Error: Variable '" + posicion1 + "' no declarada en la línea " + ctx.start.getLine());
                        return null;
                    }
                    caoposicion += "\n\t%"+posicion1+"_val"+arreglosconter+" = load i32, i32* %"+posicion1 ;
                    posicion1 = "%"+ posicion1+"_val"+arreglosconter;
                }
            }

            varName = varName.split("\\[")[0];
        }
        arreglosconter++;

        Symbol symbol = symbolTable.lookup(varName);

        String typevaras = "";
        if (symbol == null) {
            errors.add("Error: Variable '" + varName + "' no declarada en la línea " + ctx.start.getLine());
            return null;
        }
        String typevar = symbol.getType();
        symbolTable.setValue(varName, ctx.expression().getText());


        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;

        if(ctx.expression() instanceof pascalParser.ValuesExpressionContext)
        {
            exprecionVar = ctx.expression().getText();
            Symbol symbol2 = symbolTable.lookup(exprecionVar);

            if(symbol2 != null)
            {
                typevaras = symbol2.getType();
                if (typevaras.toLowerCase() != typevar.toLowerCase() )
                {
                    errors.add("Error: No puedes asignarle un valor "+ typevaras + " a una variable de tipo "+ typevar);
                    return null;
                }
            }


        }



        //codigo llvm
        if (symbol.getType().toLowerCase().equals("integer")) {
            // store i32 1, i32* %x           ; Asigna el valor 1 a la variable x
            if(exprecionVar.toLowerCase().equals("true") || exprecionVar.toLowerCase().equals("false"))
            {
                errors.add("Error: No puedes asignarle un valor booleano a una variable de tipo "+ typevar);
                return null;
            }else if(exprecionVar.toLowerCase().contains("'"))
            {
                errors.add("Error: No puedes asignarle un valor string a una variable de tipo "+ typevar);
                return null;
            }

            if (symbol.getFunction()) {
                codigo_LLVMfunciones += coddigoexpresion;
                codigo_LLVMfunciones += "\n\tret i32 " + exprecionVar;
            }else if(symbol.getPertfunction() != null){
                codigo_LLVMfunciones += coddigoexpresion;
                codigo_LLVMfunciones += "\n\tstore i32 " + exprecionVar + ", i32* %" + varName;
            }else {
                codigo_LLVMmain += coddigoexpresion;
                if(arregloN)
                {
                    // ; Asignación a arreglo unidimensional
                    //  %arreglo_ptr = getelementptr [50 x i32], [50 x i32]* @arreglo, i32 0, i32 1
                    //  store i32 5, i32* %arreglo_ptr
                    String rango1 = symbol.getRangosarreglo();
                    codigo_LLVMmain += caoposicion;
                    codigo_LLVMmain += "\n\t%"+varName+"_prt"+arreglosconter+ " = getelementptr ["+rango1+" x i32], ["+rango1+" x i32]* @"+varName+", i32 0, i32 "+posicion1;
                    varName = varName+"_prt"+arreglosconter;
                }else if(arregloB)
                {
                    //  ; Asignación a arreglo bidimensional
                    //  %arreglo_bidi_ptr = getelementptr [10 x [5 x i32]], [10 x [5 x i32]]* @arreglo_bidi, i32 0, i32 1, i32 3
                    //  store i32 5, i32* %arreglo_bidi_ptr
                    String rangos = symbol.getRangosarreglo();
                    String rango1 = rangos.split(",")[0];
                    String rango2 =  rangos.split(",")[1];
                    codigo_LLVMmain += caoposicion;
                    codigo_LLVMmain += "\n\t%"+varName+"_prt"+arreglosconter+ " = getelementptr ["+rango1+" x ["+rango2+" x i32]], ["+rango1+" x ["+rango2+" x i32]]* @"+varName+", i32 0, i32 "+posicion1+", i32 " + posicion2;
                    varName = varName+"_prt"+arreglosconter;
                }
                codigo_LLVMmain += "\n\tstore i32 " + exprecionVar + ", i32* %" + varName;
            }
        }else if(symbol.getType().toLowerCase().equals("boolean"))
        {
            if(exprecionVar.toLowerCase().contains("1") || exprecionVar.toLowerCase().contains("2")|| exprecionVar.toLowerCase().contains("3")|| exprecionVar.toLowerCase().contains("4") || exprecionVar.toLowerCase().contains("5")
                    || exprecionVar.toLowerCase().contains("6")|| exprecionVar.toLowerCase().contains("7") || exprecionVar.toLowerCase().contains("8")|| exprecionVar.toLowerCase().contains("9")|| exprecionVar.toLowerCase().contains("0"))
            {
                errors.add("Error: No puedes asignarle un valor Entero a una variable de tipo "+ typevar);
                return null;
            }else if(exprecionVar.toLowerCase().contains("'"))
            {
                errors.add("Error: No puedes asignarle un valor string a una variable de tipo "+ typevar);
                return null;
            }
            //store i1 0, i1* %bool_var   ; Asigna el valor false (0) a bool_var

            int vool = 0;
            if(ctx.expression().getText().equals("true"))
            {
                vool = 1;
            }
            if (symbol.getFunction()) {
                codigo_LLVMfunciones += "\n\tret i1 " + vool;
            }else if(symbol.getPertfunction() != null){
                codigo_LLVMfunciones += "\n\tstore i1 " + vool + ", i1* %" + varName;
            }else {
                codigo_LLVMmain += "\n\tstore i1 " + vool + ", i1* %" + varName;
            }
        } else if(symbol.getType().toLowerCase().equals("char"))
        {
            //store i8 65, i8* %char_var  ; Asigna el valor 65 ('A') a char_var

            char c = ctx.expression().getText().charAt(0);  // Extraer el primer (y único) carácter de la cadena
            int asciiValue = (int) c;  // Obtener el valor ASCII del carácter
            if (symbol.getFunction()) {
                codigo_LLVMfunciones += "\n\tret i8 " + asciiValue;
            }else if(symbol.getPertfunction() != null){
                codigo_LLVMfunciones += "\n\tstore i8 " + asciiValue + ", i8* %" + varName;
            }else {
                codigo_LLVMmain += "\n\tstore i8 " + asciiValue + ", i8* %" + varName;
            }

        } else if(symbol.getType().toLowerCase().equals("string"))
        {
            System.out.println("asignacion string");
        } else
        {
            System.out.println("asignacion arreglo");
        }
            coddigoexpresion = "";

            arreglosconter++;
            return null;

        }

    @Override
    public Void visitAddSubExpression(pascalParser.AddSubExpressionContext ctx) {
        //BRACKET_LEFT expression BRACKET_RIGHT
        //%sum = add i32 1, 2
        String valor1 = "";
        String valor2 = "";
        String codigovariables = "";
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        if(ctx.expression(0) instanceof pascalParser.ValuesExpressionContext)
        {
            if(((pascalParser.ValuesExpressionContext) ctx.expression(0)).optional_values().ID() != null) {
                codigovariables += "\n\t%" + ctx.expression(0).getText() + "_load" + counteload + " = load i32, i32* %" + ctx.expression(0).getText();
                valor1 += "%" + ctx.expression(0).getText() + "_load" + counteload;
                counteload++;
            }else {

                valor1 = ctx.expression(0).getText();
            }

        }else
        {
            valor1 = exprecionVar;
        }

        if(ctx.expression(1) instanceof pascalParser.ValuesExpressionContext)
        {
            if(((pascalParser.ValuesExpressionContext) ctx.expression(1)).optional_values().ID() != null)
            {
                codigovariables += "\n\t%"+ctx.expression(1).getText()+"_load"+counteload+" = load i32, i32* %"+ctx.expression(1).getText();
                valor2 += "%"+ctx.expression(1).getText()+"_load"+counteload;
                counteload++;
            }else {

                valor2 = ctx.expression(1).getText();
            }
        }else
        {
            valor2 = exprecionVar;
        }


            coddigoexpresion += codigovariables;
        if (ctx.PLUS() != null) {

            coddigoexpresion += "\n\t%sum"+ counterexpre +" = add i32 "+valor1+", "+valor2;
            exprecionVar = "%sum"+ counterexpre ;
        } else if (ctx.MINUS() != null) {
            coddigoexpresion += "\n\t%sub"+ counterexpre +" = sub i32 "+valor1+", "+valor2;
            exprecionVar = "%sub"+ counterexpre;
        }


        counterexpre = counterexpre+1;
        return null;
    }
    @Override
    public Void visitMulDivModExpression(pascalParser.MulDivModExpressionContext ctx) {
        //expression PLUS expression
        //%mul = mul i32 4, 3
        String valor1 = "";
        String valor2 = "";
        String  codigovariables = "";
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        if(ctx.expression(0) instanceof pascalParser.ValuesExpressionContext)
        {
            if(((pascalParser.ValuesExpressionContext) ctx.expression(0)).optional_values().ID() != null) {
                codigovariables += "\n\t%" + ctx.expression(0).getText() + "_load" + counteload + " = load i32, i32* %" + ctx.expression(0).getText();
                valor1 += "%" + ctx.expression(0).getText() + "_load" + counteload;
                counteload++;
            }else {

                valor1 = ctx.expression(0).getText();
            }

        }else
        {
            valor1 = exprecionVar;
        }

        if(ctx.expression(1) instanceof pascalParser.ValuesExpressionContext)
        {
            if(((pascalParser.ValuesExpressionContext) ctx.expression(1)).optional_values().ID() != null)
            {
                codigovariables += "\n\t%"+ctx.expression(1).getText()+"_load"+counteload+" = load i32, i32* %"+ctx.expression(1).getText();
                valor2 += "%"+ctx.expression(1).getText()+"_load"+counteload;
                counteload++;
            }else {

                valor2 = ctx.expression(1).getText();
            }
        }else
        {
            valor2 = exprecionVar;
        }
        coddigoexpresion += codigovariables;
        if (ctx.MULT() != null) {
            coddigoexpresion += "\n\t%mul"+ counterexpre  +" = mul i32 "+valor1+", "+valor2;
            exprecionVar = "%mul"+ counterexpre;
        } else if (ctx.DIV() != null) {
            coddigoexpresion += "\n\t%div"+ counterexpre +" = sdiv i32 "+valor1+", "+valor2;
            exprecionVar = "%div"+ counterexpre;
        } else if (ctx.MOD() != null) {
            coddigoexpresion += "\n\t%mod"+ counterexpre +" = srem i32 "+valor1+", "+valor2;
            exprecionVar = "%mod"+ counterexpre;
        }

        counterexpre = counterexpre+1;
        return null;
    }

    @Override
    public Void visitArrayCallExpression(pascalParser.ArrayCallExpressionContext ctx)
    {
        String arregloname = ctx.array_call().ID().getText();

        Symbol symbol = symbolTable.lookup(arregloname);
        if(symbol == null){
            errors.add("Error: Arreglo '" + arregloname + "' no declarada en la línea " + ctx.start.getLine());
            return null;
        }
        String posicion1 = ctx.array_call().arraybi1().getText();
        if(ctx.array_call().arraybi1().ID() != null)
        {
            Symbol symbol3 = symbolTable.lookup(posicion1);
            if(symbol3 == null){
                errors.add("Error: Variable '" + posicion1 + "' no declarada en la línea " + ctx.start.getLine());
                return null;
            }
            coddigoexpresion += "\n\t%"+posicion1+"_valassing"+counteload+" = load i32, i32* %"+posicion1 ;
            posicion1 = "%"+ posicion1+"_valassing"+counteload;
        }
        String rangos = symbol.getRangosarreglo();
        String rango1 = rangos.split(",")[0];
        //%arreglo_bidi_ptr5 = getelementptr [10 x [5 x i32]], [10 x [5 x i32]]* @arreglo_bidi, i32 0, i32 %i_valwrite3, i32 %j_valwrite4
        //	%arreglo_bidi_load5 = load i32, i32* %arreglo_bidi_ptr5
        codigo_LLVMmain += "\n\t%"+arregloname+"_prt_assing"+counteload+ " = getelementptr ["+rango1+" x i32], ["+rango1+" x i32]* @"+arregloname+", i32 0, i32 "+posicion1;
        coddigoexpresion += "%"+arregloname+"_load_assing"+counteload+" = load i32, i32* %"+arregloname+"_prt_assing"+counteload;
        exprecionVar = "%mul"+ counterexpre;
        counteload++;
        return null;
    }

    @Override
    public Void visitArrayBiCallExpression(pascalParser.ArrayBiCallExpressionContext ctx)
    {
        String arregloname = ctx.arraybi_call().ID().getText();

        Symbol symbol = symbolTable.lookup(arregloname);
        if(symbol == null){
            errors.add("Error: Arreglo '" + arregloname + "' no declarada en la línea " + ctx.start.getLine());
            return null;
        }
        String posicion1 = ctx.arraybi_call().arraybi1().getText();
        if(ctx.arraybi_call().arraybi1().ID() != null)
        {
            Symbol symbol3 = symbolTable.lookup(posicion1);
            if(symbol3 == null){
                errors.add("Error: Variable '" + posicion1 + "' no declarada en la línea " + ctx.start.getLine());
                return null;
            }
            coddigoexpresion += "\n\t%"+posicion1+"_valassing"+counteload+" = load i32, i32* %"+posicion1 ;
            posicion1 = "%"+ posicion1+"_valassing"+counteload;
        }
        String posicion2 = ctx.arraybi_call().arraybi2().getText();
        if(ctx.arraybi_call().arraybi2().ID() != null)
        {
            Symbol symbol3 = symbolTable.lookup(posicion2);
            if(symbol3 == null){
                errors.add("Error: Variable '" + posicion2 + "' no declarada en la línea " + ctx.start.getLine());
                return null;
            }
            coddigoexpresion += "\n\t%"+posicion2+"_valassing"+counteload+" = load i32, i32* %"+posicion2 ;
            posicion2 = "%"+ posicion2+"_valassing"+counteload;
        }

        String rangos = symbol.getRangosarreglo();
        String rango1 = rangos.split(",")[0];
        String rango2 =  rangos.split(",")[1];

        coddigoexpresion += "\n\t%"+arregloname+"_prt_assing"+counteload+ " = getelementptr ["+rango1+" x ["+rango2+" x i32]], ["+rango1+" x ["+rango2+" x i32]]* @"+arregloname+", i32 0, i32 "+posicion1+", i32 " + posicion2;
        //%arreglo_bidi_ptr5 = getelementptr [10 x [5 x i32]], [10 x [5 x i32]]* @arreglo_bidi, i32 0, i32 %i_valwrite3, i32 %j_valwrite4
        //	%arreglo_bidi_load5 = load i32, i32* %arreglo_bidi_ptr5
        coddigoexpresion += "%"+arregloname+"_load_assing"+counteload+" = load i32, i32* %"+arregloname+"_prt_assing"+counteload;
        exprecionVar = "%"+arregloname+"_load_assing"+counteload;
        counteload++;
        return null;
    }

    @Override
    public Void visitWrite_function(pascalParser.Write_functionContext ctx)
    {
        //WRITE BRACKET_LEFT writeId BRACKET_RIGHT SEMI_COLON;
        //primero para solo texto
        String texto;

        int size;
        if(ctx.writeId().getText().contains(",") && ctx.writeId().getText().contains("\'"))
        {
            texto = ctx.writeId().getText();

            String[] partes = texto.split(",");
            partes[0] = partes[0].replace("'", "");

            String arregloname = ""; //parte[1]
            String posicion1 = "";
            String posicion2 = "";
            String rango1 = "";
            String rango2 ="";
            String codigomas = "";
            if(partes[1].contains("["))
            {
                if(partes.length == 3)
                {
                    partes[1] = partes[1]+","+partes[2];
                }
                arregloname = partes[1];
               if(partes[1].contains(","))
               {
                   posicion1 = partes[1].split("\\[")[1].split(",")[0];
                   posicion2 = partes[1].split("\\[")[1].split(",")[1].split("]")[0];

                   if(((pascalParser.IdWriteContext) ctx.writeId()).arraybi_call().arraybi1().ID()!= null)
                   {

                       Symbol symbol9 = symbolTable.lookup(posicion1);
                       if(symbol9 == null){
                           errors.add("Error: Variable '" + posicion1 + "' no declarada en la línea " + ctx.start.getLine());
                           return null;
                       }
                       codigomas += "\n\t%"+posicion1+"_valwritecon"+counteload+" = load i32, i32* %"+posicion1 ;
                       posicion1 = "%"+ posicion1+"_valwritecon"+counteload;
                   }
                   counteload++;
                   if(((pascalParser.IdWriteContext) ctx.writeId()).arraybi_call().arraybi2().ID()!= null)
                   {

                       Symbol symbol9 = symbolTable.lookup(posicion2);
                       if(symbol9 == null){
                           errors.add("Error: Variable '" + posicion2 + "' no declarada en la línea " + ctx.start.getLine());
                           return null;
                       }
                       codigomas += "\n\t%"+posicion2+"_valwritecon"+counteload+" = load i32, i32* %"+posicion2 ;
                       posicion2 = "%"+ posicion2+"_valwritecon"+counteload;
                   }
               }else
               {
                   posicion1 = partes[1].split("\\[")[1].split("]")[0];

                   if(((pascalParser.IdWriteContext) ctx.writeId()).array_call().arraybi1().ID()!= null)
                   {
                       Symbol symbol10 = symbolTable.lookup(posicion1);
                       if(symbol10 == null){
                           errors.add("Error: Variable '" + posicion1 + "' no declarada en la línea " + ctx.start.getLine());
                           return null;
                       }
                       codigomas += "\n\t%"+posicion1+"_valwritecon"+counteload+" = load i32, i32* %"+posicion1 ;
                       posicion1 = "%"+ posicion1+"_valwritecon"+counteload;
                   }
                   counteload++;
               }
               partes[1] = partes[1].split("\\[")[0];
            }

            Symbol symbol = symbolTable.lookup(partes[1]);
            if (symbol == null) {
                errors.add("Error: Variable '" + partes[1] + "' no declarada en la línea " + ctx.start.getLine());
                return null;
            }
            if(arregloname.contains("["))
            {
                if(arregloname.contains(",")){
                    rango1 = symbol.getRangosarreglo().split(",")[0];
                    rango2 = symbol.getRangosarreglo().split(",")[1];
                }else
                {
                    rango1 = symbol.getRangosarreglo().split(",")[0];
                }
            }

            //@.fmt = private unnamed_addr constant [19 x i8] c"El valor de x es: %d\0A\00", align 1

            if(texto.contains("%d"))
            {
                if (ctx.WRITE().getText().toLowerCase().equals("write"))
                {
                    size = partes[0].length() + 1;
                    codigo_LLVM += "\n@.fmt_read" + countermsg + " = private unnamed_addr constant [" + size + " x i8] c\"" + partes[0] + "\\00\"";
                }else
                {
                    size = partes[0].length() + 2;
                    codigo_LLVM += "\n@.fmt_read" + countermsg + " = private unnamed_addr constant [" + size + " x i8] c\"" + partes[0] + "\\0A\\00\"";
                }

            }else
            {
                if (ctx.WRITE().getText().toLowerCase().equals("write"))
                {
                    size = partes[0].length() + 3;
                    codigo_LLVM += "\n@.fmt_read" + countermsg + " = private unnamed_addr constant [" + size + " x i8] c\"" + partes[0] + "%d\\00\"";
                }else {
                    size = partes[0].length() + 4;
                    codigo_LLVM += "\n@.fmt_read" + countermsg + " = private unnamed_addr constant [" + size + " x i8] c\"" + partes[0] + "%d\\0A\\00\"";
                }
            }

            if(arregloname.contains("["))
            {
                if(arregloname.contains(","))
                {
                    // %bidi_ptr = getelementptr [10 x [5 x i32]], [10 x [5 x i32]]* @arreglo_bidi, i32 0, i32 1, i32 3
                    //parte[1] = %bidi_prt
                    codigo_LLVMmain += codigomas;
                    codigo_LLVMmain+= "\n\t%"+partes[1]+"_ptr"+ counteload + " = getelementptr ["+rango1+" x ["+rango2+" x i32]], ["+rango1+" x ["+rango2+" x i32]]* @"+partes[1]+", i32 0, i32 "+posicion1+", i32 "+posicion2;
                    partes[1] = partes[1]+"_ptr"+ counteload;
                }else
                {
                    //%arreglo_ptr = getelementptr [50 x i32], [50 x i32]* @arreglo, i32 0, i32 1
                    codigo_LLVMmain += codigomas;
                    codigo_LLVMmain+= "\n\t%"+partes[1]+"_ptr"+counteload+" = getelementptr ["+rango1+" x i32], ["+rango1+" x i32]* @"+partes[1]+", i32 0, i32 "+posicion1;
                    partes[1] = partes[1]+"_ptr"+ counteload;
                }
            }

            codigo_LLVMmain += "\n\t%" + partes[1] + "_load" + counteload + " = load i32, i32* %" + partes[1];
            //call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([19 x i8], [19 x i8]* @.fmt, i32 0, i32 0), i32 %x_val)
            codigo_LLVMmain += "\n\tcall i32 (i8*, ...) @printf(i8* getelementptr inbounds (["+size+" x i8], ["+size+" x i8]* @.fmt_read"+countermsg+", i32 0, i32 0), i32 %" + partes[1] + "_load" + counteload + ")";
            countermsg++;
        }else {
            if (ctx.writeId() instanceof pascalParser.IdTextContext) {

                texto = ctx.writeId().getText();
                texto = texto.replace("'", "");
                size = texto.length() + 2;
                codigo_LLVM += "\n@mensaje" + countermsg + " = constant [" + size + " x i8] c\"" + texto + "\\0A\\00\"";
                codigo_LLVMmain += "\n\t%msg_ptr" + countermsg + " = getelementptr [" + size + " x i8], [" + size + " x i8]* @mensaje" + countermsg + ", i32 0, i32 0\n" +
                        "    call i32 (i8*, ...) @printf(i8* %msg_ptr" + countermsg + ")\n";

                countermsg++;
            } else if (ctx.writeId() instanceof pascalParser.IdWriteContext) {
                texto = ctx.writeId().getText();

                Symbol symbol = symbolTable.lookup(texto);
                if (symbol == null) {
                    errors.add("Error: Variable '" + texto + "' no declarada en la línea " + ctx.start.getLine());
                    return null;
                }

                // %x_val = load i32, i32* %x     ; Carga el valor de x desde la memoria
                //
                //  ; Preparar el formato de printf para imprimir el valor de x
                //  %fmt = bitcast [3 x i8] to i8* ; Formato "%d\n" para imprimir un número entero
                //  call i32 (i8*, ...) @printf(i8* %fmt, i32 %x_val)

                if (symbol.getType().toLowerCase().equals("integer")) {

                    codigo_LLVMmain += "\n\t%" + texto + "_load" + counteload + " = load i32, i32* %" + texto;
                    codigo_LLVMmain += "\n\tcall i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.fmt, i32 0, i32 0), i32 %" + texto + "_load" + counteload + ")";
                }


            } else if (ctx.writeId() instanceof pascalParser.ArrayWriteContext ) {
                System.out.println("Es arreglo normal write");


                String arregloname = ctx.writeId().getText().split("\\[")[0];
                Symbol symbol1 = symbolTable.lookup(arregloname);
                if(symbol1 == null)
                {
                    errors.add("Error: Arreglo '" + arregloname + "' no declarado en la línea " + ctx.start.getLine());
                    return null;
                }
                String posicion1 = ctx.writeId().getText().split("\\[")[1].split("]")[0];
                String codepose1 = "";

                if(((pascalParser.ArrayWriteContext) ctx.writeId()).array_call().arraybi1().ID() != null)
                {

                    Symbol symbol5 = symbolTable.lookup(posicion1);
                    if(symbol5 == null){
                        errors.add("Error: Variable '" + posicion1 + "' no declarada en la línea " + ctx.start.getLine());
                        return null;
                    }
                    codepose1 += "\n\t%"+posicion1+"_valwrite"+counteload+" = load i32, i32* %"+posicion1 ;
                    posicion1 = "%"+ posicion1+"_valwrite"+counteload;
                }
                counteload++;

                String rango1 = symbol1.getRangosarreglo();

                codigo_LLVMmain += codepose1;
                //%arreglo_ptr = getelementptr [50 x i32], [50 x i32]* @arreglo, i32 0, i32 1
                codigo_LLVMmain += "\n\t%"+arregloname+"_ptr"+counteload+" = getelementptr ["+rango1+" x i32], ["+rango1+" x i32]* @"+arregloname+", i32 0, i32 "+posicion1;
                //%arreglo_val = load i32, i32* %arreglo_ptr, align 4
                codigo_LLVMmain += "\n\t%"+arregloname+"_load"+counteload+" = load i32, i32* %"+arregloname+"_ptr"+ counteload;
                //  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.fmt, i32 0, i32 0), i32 %arreglo_val)
                codigo_LLVMmain += "\n\tcall i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.fmt, i32 0, i32 0), i32 %" + arregloname + "_load" + counteload + ")";

            } else if (ctx.writeId() instanceof pascalParser.ArraybiWriteContext){

                String arregloname = ctx.writeId().getText().split("\\[")[0];
                Symbol symbol1 = symbolTable.lookup(arregloname);
                if(symbol1 == null)
                {
                    errors.add("Error: Arreglo '" + arregloname + "' no declarado en la línea " + ctx.start.getLine());
                    return null;
                }
                String posicion1 = ctx.writeId().getText().split("\\[")[1].split(",")[0];
                String posicion2 = ctx.writeId().getText().split("\\[")[1].split(",")[1].split("]")[0];
                String rango1 = symbol1.getRangosarreglo().split(",")[0];
                String rango2 = symbol1.getRangosarreglo().split(",")[1];

                String codepose1 ="";
                if(((pascalParser.ArraybiWriteContext) ctx.writeId()).arraybi_call().arraybi1().ID() != null)
                {

                    Symbol symbol9 = symbolTable.lookup(posicion1);
                    if(symbol9 == null){
                        errors.add("Error: Variable '" + posicion1 + "' no declarada en la línea " + ctx.start.getLine());
                        return null;
                    }
                    codepose1 += "\n\t%"+posicion1+"_valwrite"+counteload+" = load i32, i32* %"+posicion1 ;
                    posicion1 = "%"+ posicion1+"_valwrite"+counteload;
                }
                counteload++;
                if(((pascalParser.ArraybiWriteContext) ctx.writeId()).arraybi_call().arraybi2().ID() != null)
                {

                    Symbol symbol9 = symbolTable.lookup(posicion2);
                    if(symbol9 == null){
                        errors.add("Error: Variable '" + posicion2 + "' no declarada en la línea " + ctx.start.getLine());
                        return null;
                    }
                    codepose1 += "\n\t%"+posicion2+"_valwrite"+counteload+" = load i32, i32* %"+posicion2 ;
                    posicion2 = "%"+ posicion2+"_valwrite"+counteload;
                }
                counteload++;
                codigo_LLVMmain += codepose1;
                //%bidi_ptr = getelementptr [10 x [5 x i32]], [10 x [5 x i32]]* @arreglo_bidi, i32 0, i32 1, i32 3
                codigo_LLVMmain += "\n\t%"+arregloname+"_ptr"+counteload+" = getelementptr ["+rango1+" x ["+rango2+" x i32]], ["+rango1+" x ["+rango2+" x i32]]* @"+arregloname+", i32 0, i32 "+posicion1+", i32 "+ posicion2;
                //  %bidi_val = load i32, i32* %bidi_ptr, align 4
                codigo_LLVMmain += "\n\t%"+arregloname+"_load"+counteload+" = load i32, i32* %"+arregloname+"_ptr"+ counteload;
                //  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.fmt, i32 0, i32 0), i32 %bidi_val)
                codigo_LLVMmain += "\n\tcall i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.fmt, i32 0, i32 0), i32 %" + arregloname + "_load" + counteload + ")";

            }
        }

        counteload++;
        return null;
    }

    @Override
    public Void visitRead_function(pascalParser.Read_functionContext ctx)
    {

        String id=ctx.readId().getText();
        //@.fmt_read = private unnamed_addr constant [3 x i8] c"%d\00", align 1
        //call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.fmt_read, i32 0, i32 0), i32* %x)
        Symbol symbol = symbolTable.lookup(id);
        if (symbol == null) {
            errors.add("Error: Variable '" + id + "' no declarada en la línea " + ctx.start.getLine());
            return null;
        }
        codigo_LLVM += "@.read"+counterread+"= private unnamed_addr constant [3 x i8] c\"%d\\00\"";
        codigo_LLVMmain += "\n\tcall i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.read"+counterread+", i32 0, i32 0), i32* %"+id+")";
        counterread++;
        return null;
    }
    @Override
    public Void visitForBlock(pascalParser.ForBlockContext ctx){
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }
    @Override
    public Void visitForDecla(pascalParser.ForDeclaContext ctx){
        String C_to = ctx.C_to().getText();
        String assign = ctx.forcondition().idfor().getText();

        String value = ctx.forcondition().valuesfor().getText();
        String codigovalue = "";
        String codigocondi = "";
        String codigoend = "";

        //; Inicializar i con el valor de x
        //    %x_val = load i32, i32* %x, align 4
        //    store i32 %x_val, i32* %i, align 4
        //
        if(ctx.forcondition().valuesfor().ID() != null)
        {
            codigovalue += "\n\t%"+value+"_val"+counterforload+" = load i32, i32* %"+value;
            codigovalue += "\n\tstore i32 %"+value+"_val"+counterforload+ ", i32* %"+assign;

        }else
        {
            codigovalue += "\n\tstore i32 "+value+", i32* %"+assign;
        }
        counterforload++;
        String hasta = ctx.valuesfor().getText();
        String codihasta="";
        if(ctx.valuesfor().ID() != null)
        {

            codihasta+= "\n\t%"+hasta+"_val"+counterforload+" = load i32, i32* %"+hasta;;
            hasta = "%"+ hasta + "_val"+counterforload;
        }else
        {
            System.out.println("hasta numero " + hasta);
        }
        counterforload++;





        //    ; Comienzo del bucle for (i := 10 downto 1)
        //    br label %loop_cond

        //conicion
        //loop_cond:
        //    ; Cargar valor de i y comparar con 1
        //    %i_val = load i32, i32* %i, align 4
        //    %cmp = icmp sge i32 %i_val, 1
        //    br i1 %cmp, label %loop_body, label %loop_end
        codigocondi += "\n\tbr label %loop_cond"+counterforloops;
        codigocondi += "\n\nloop_cond"+counterforloops +":";
        codigocondi += "\n\t%"+assign+"_val"+counterforload+" = load i32, i32* %"+assign;
        boolean down = false;
        if(C_to.toLowerCase().equals("downto"))
        {
            codigocondi += "\n\t%cmp"+counterforloops+" = icmp sge i32 "+"%"+assign+"_val"+counterforload + ", "+ hasta;
            down = true;
        }else
        {
            codigocondi += codihasta;
            codigocondi += "\n\t%cmp"+counterforloops+" = icmp sle i32 "+"%"+assign+"_val"+counterforload + ", "+ hasta;
        }
        counterforload++;
        codigocondi += "\n\tbr i1 %cmp"+counterforloops+", label %loop_body"+counterforloops + ", label %loop_end"+counterforloops;
        codigocondi += "\nloop_body"+counterforloops+":";
        codigo_LLVMmain += codigovalue;
        codigo_LLVMmain += codigocondi;
        //; Decrementar i (i := i - 1)
        //    %i_val2 = load i32, i32* %i, align 4
        //    %dec = sub i32 %i_val2, 1
        //    store i32 %dec, i32* %i, align 4
        //
        //    ; Volver al inicio del bucle
        //    br label %loop_cond
        String end = "";
        counterforload++;
        end += "\n\t%"+assign+"_val"+counterforload+" = load i32, i32* %"+assign;
        if(down)
        {
            end += "\n\t%dec"+counterforload + " = sub i32 %"+assign+"_val"+counterforload+", 1";
        }else
        {
            end += "\n\t%dec"+counterforload + " = add i32 %"+assign+"_val"+counterforload+", 1";
        }
        end += "\n\tstore i32 %dec"+counterforload+", i32* %"+assign;
        end += "\n\tbr label %loop_cond"+counterforloops;
        end += "\nloop_end"+counterforloops + ":";

        counterforload++;
        counterforloops++;
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;

        codigo_LLVMmain += end;
        counterforload++;

        return null;
    }

    @Override
    public Void visitIfBlock(pascalParser.IfBlockContext ctx)
    {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }

    @Override
    public Void visitIfDecla(pascalParser.IfDeclaContext ctx)
    {
        String codigoif = "";

        String cond1 =ctx.ifcondition().getChild(0).getText();
        Symbol symbol = symbolTable.lookup(cond1);
        if (symbol == null) {
            errors.add("Error: Variable '" + cond1 + "' no declarada en la línea " + ctx.start.getLine());
            return null;
        }
        String condvar = "";
        String cond2 = ctx.ifcondition().cond2().getText();
        if(ctx.ifcondition().cond2().ID() != null)
        {
            condvar += "\n\t%"+ cond2 + "_val"+ conterifs + " load i32, i32* %"+ cond2;;
            Symbol symbol2 = symbolTable.lookup(cond2);
            if (symbol2 == null) {
                errors.add("Error: Variable '" + cond1 + "' no declarada en la línea " + ctx.start.getLine());
                return null;
            }
            cond2 = "%"+cond2+"_val"+conterifs;
        }

        String evaluacion =ctx.ifcondition().conditionvali().getText();
        if(evaluacion.equals("="))
        {
            evaluacion= " icmp eq ";
        }else if(evaluacion.equals("<>"))
        {
            evaluacion=" icmp ne ";
        }else if(evaluacion.equals(">"))
        {
            evaluacion=" icmp sgt ";
        }else if(evaluacion.equals(">="))
        {
            evaluacion =" icmp sge ";
        }else if(evaluacion.equals("<"))
        {
            evaluacion =" icmp slt ";
        }else if(evaluacion.equals("<="))
        {
            evaluacion =" icmp sle ";
        }else if(evaluacion.equals("AND"))
        {
            evaluacion =" and i1 ";
        }else if(evaluacion.equals("OR"))
        {
            evaluacion =" or i1 ";
        }else if(evaluacion.equals("NOT"))
        {
            evaluacion =" xor i1 sge ";
        }



        //codigo
        //%x_val = load i32, i32* %x, align 4
        //  %cond = icmp eq i32 %x_val, 1
        //
        //  br i1 %cond, label %if.then, label %if.else

        codigoif += "\n\t%"+ cond1 + "_val"+ conterifs + " = load i32, i32* %"+ cond1;
        codigoif+= condvar;
        codigoif += "\n\t%cond"+conterifs+ " = "+ evaluacion+ "i32 %"+cond1 +"_val"+conterifs +", "+ cond2;
        String elses= "";
        if(ctx.C_ELSE()!=null)
        {
            codigoif += "\n\tbr i1 %cond"+conterifs +", label %if.then"+ conterifslabes+", label %if.else"+ conterifslabes;
            elses = "\nif.else"+ conterifslabes;
        }else {
            codigoif += "\n\tbr i1 %cond" + conterifs + ", label %if.then" + conterifslabes + ", label %if.end"+conterifslabes;
        }
        codigoif += "\nif.then"+ conterifslabes+":";
        String end = "if.end"+conterifslabes;

        codigo_LLVMmain += codigoif;

        if(ctx.BEGIN() != null)
        {
            visitChildren(ctx.statements());
        }else
        {
            visitChildren(ctx.typesstatemes(0));
        }

//  br label %if.end

        codigo_LLVMmain += "\n\tbr label %" + end;

        if(ctx.C_ELSE() != null)
        {
            codigo_LLVMmain += elses + ":";
            visitChildren(ctx.typesstatemes(1));
            codigo_LLVMmain += "\n\tbr label %" + end;
        }

        codigo_LLVMmain += "\n"+end+":\n";

        conterifslabes++;
        conterifs++;
        //if.then:
        //
        //  %x_val_then = load i32, i32* %x, align 4
        //  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([7 x i8], [7 x i8]* @.fmt_x, i32 0, i32 0), i32 %x_val_then)
        //  br label %if.end
        //
        //if.else:
        //  %y_val_else = load i32, i32* %y, align 4
        //  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([7 x i8], [7 x i8]* @.fmt_y, i32 0, i32 0), i32 %y_val_else)
        //  br label %if.end
        //
        //if.end:
        //  ret i32 0


        return null;
    }


    //whiles
    @Override
    public Void visitWhileBlock(pascalParser.WhileBlockContext ctx)
    {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }

    @Override
    public Void visitWhileDecla(pascalParser.WhileDeclaContext ctx)
     {
        String codigowhile = "";
        String variable1 = ctx.condition().ID().getText();

        Symbol symbol = symbolTable.lookup(variable1);
        if (symbol == null) {
            errors.add("Error: Variable '" + variable1 + "' no declarada en la línea " + ctx.start.getLine());
            return null;
        }
        String evaluacion = ctx.condition().conditionvali().getText();
        if(evaluacion.equals("="))
        {
            evaluacion= " icmp eq ";
        }else if(evaluacion.equals("<>"))
        {
            evaluacion=" icmp ne ";
        }else if(evaluacion.equals(">"))
        {
            evaluacion=" icmp sgt ";
        }else if(evaluacion.equals(">="))
        {
            evaluacion =" icmp sge ";
        }else if(evaluacion.equals("<"))
        {
            evaluacion =" icmp slt ";
        }else if(evaluacion.equals("<="))
        {
            evaluacion =" icmp sle ";
        }else if(evaluacion.equals("AND"))
        {
            evaluacion =" and i1 ";
        }else if(evaluacion.equals("OR"))
        {
            evaluacion =" or i1 ";
        }else if(evaluacion.equals("NOT"))
        {
            evaluacion =" xor i1 sge ";
        }
        String value2 = ctx.condition().codition2().getText();
        String codigovalue2 = "";
        if(ctx.condition().codition2().sentence() != null)
        {
            visitChildren(ctx.condition().codition2().sentence());


            value2 = exprecionVar;

            codigovalue2 = coddigoexpresion;
            exprecionVar = "";
            coddigoexpresion ="";
        }else if(ctx.condition().codition2().ID() != null)
        {
            Symbol symbol2 = symbolTable.lookup(value2);
            if (symbol2 == null) {
                errors.add("Error: Variable '" + value2 + "' no declarada en la línea " + ctx.start.getLine());
                return null;
            }
            codigovalue2 = "\n\t%"+value2+"_val"+ conterWhileload+ " = load i32, i32* %"+value2;;
            value2 = "%"+value2+"_val"+ conterWhileload;
        }



        //; Etiqueta de inicio del bucle
        //  br label %while.cond
        codigowhile += "\n\tbr label %while.cond"+conterWhile;

        //
        //while.cond:
        //  %x_val = load i32, i32* %x
        //  %lenght_val = load i32, i32* %lenght
        //  %cond = icmp sle i32 %x_val, %lenght_val
        //  br i1 %cond, label %while.body, label %while.end
        codigowhile += "\nwhile.cond"+conterWhile + ":";
        codigowhile += "\n\t%"+variable1+"_val"+ conterWhileload+ " = load i32, i32* %"+variable1;
        codigowhile += codigovalue2;
        codigowhile += "\n\t%cond"+conterWhile+" = "+evaluacion+" i32 %"+variable1+"_val"+conterWhileload+", "+ value2;
        codigowhile += "\n\tbr i1 %cond"+conterWhile+", label %while.body"+conterWhile+", label %while.end"+conterWhile;

        codigowhile += "\nwhile.body" + conterWhile+":";
        String whilecond = "%while.cond"+conterWhile;
        String whileend = "while.end"+conterWhile;
        conterWhile++;
        conterWhileload++;
        codigo_LLVMmain += codigowhile;
        visitChildren(ctx.statements());
        //  ; Incrementar x
        //  %x_val_next = add i32 %x_val_body, 1
        //  store i32 %x_val_next, i32* %x
        //
        //  ; Volver a la condición
        //  br label %while.cond
        //
        //while.end:

        codigowhile = "\n\tbr label "+whilecond;
        codigowhile += "\n"+ whileend + ":";
        codigo_LLVMmain+= codigowhile;

        //while.body:
        //  ; Imprimir el valor de x
        //  %x_val_body = load i32, i32* %x, align 4
        //  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([7 x i8], [7 x i8]* @.fmt, i32 0, i32 0), i32 %x_val_body)
        //
        //  ; Imprimir el valor de lenght
        //  %lenght_val_body = load i32, i32* %lenght, align 4
        //  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([12 x i8], [12 x i8]* @.fmt_lenght, i32 0, i32 0), i32 %lenght_val_body)
        //

        //  ret i32 0
        //}

        //condicion
        return null;
    }

    @Override
    public Void visitMain(pascalParser.MainContext ctx)
    {
        codigo_LLVM = "declare i32 @printf(i8*, ...)   ; Para imprimir texto\n" +
                        "declare i32 @scanf(i8*, ...)    ; Para leer texto\n";
        codigo_LLVM += "\n@.fmt = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1\n";
        codigo_LLVMmain = "\n\ndefine i32 @main() {\n" +
                "entry: \n";
        codigo_LLVMfunciones = "";
        coddigoexpresion ="";
        counterexpre = 0;
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        codigo_LLVMmain += "\n\tret i32 0\n}";
        return null;
    }

    public List<String> getErrors() {
        return errors;
    }
    public List<String> getErrorsSymbolTable() {
        return symbolTable.getErrors();
    }

    public String getLLVM()
    {
        String fin = codigo_LLVM += codigo_LLVMfunciones;
        fin += codigo_LLVMmain;
        return fin;
    }


    //Validaciones funciones




}
