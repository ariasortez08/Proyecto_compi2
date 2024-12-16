// Generated from C:/Users/miria/IdeaProjects/Compilador/src/Grammar/pascal.g4 by ANTLR 4.13.2
package Pascal;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pascalParser}.
 */
public interface pascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pascalParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(pascalParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(pascalParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(pascalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(pascalParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#typesstatemes}.
	 * @param ctx the parse tree
	 */
	void enterTypesstatemes(pascalParser.TypesstatemesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typesstatemes}.
	 * @param ctx the parse tree
	 */
	void exitTypesstatemes(pascalParser.TypesstatemesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(pascalParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(pascalParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(pascalParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(pascalParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(pascalParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(pascalParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(pascalParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(pascalParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCallExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCallExpression(pascalParser.ArrayCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCallExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCallExpression(pascalParser.ArrayCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayBiCallExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayBiCallExpression(pascalParser.ArrayBiCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayBiCallExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayBiCallExpression(pascalParser.ArrayBiCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValuesExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValuesExpression(pascalParser.ValuesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValuesExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValuesExpression(pascalParser.ValuesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivModExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModExpression(pascalParser.MulDivModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivModExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModExpression(pascalParser.MulDivModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#assingId}.
	 * @param ctx the parse tree
	 */
	void enterAssingId(pascalParser.AssingIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#assingId}.
	 * @param ctx the parse tree
	 */
	void exitAssingId(pascalParser.AssingIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#optional_values}.
	 * @param ctx the parse tree
	 */
	void enterOptional_values(pascalParser.Optional_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#optional_values}.
	 * @param ctx the parse tree
	 */
	void exitOptional_values(pascalParser.Optional_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void enterVarBlock(pascalParser.VarBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void exitVarBlock(pascalParser.VarBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(pascalParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(pascalParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#varID}.
	 * @param ctx the parse tree
	 */
	void enterVarID(pascalParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#varID}.
	 * @param ctx the parse tree
	 */
	void exitVarID(pascalParser.VarIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(pascalParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(pascalParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(pascalParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(pascalParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#arrDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrDecl(pascalParser.ArrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#arrDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrDecl(pascalParser.ArrDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#arr1D}.
	 * @param ctx the parse tree
	 */
	void enterArr1D(pascalParser.Arr1DContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#arr1D}.
	 * @param ctx the parse tree
	 */
	void exitArr1D(pascalParser.Arr1DContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#arr2D}.
	 * @param ctx the parse tree
	 */
	void enterArr2D(pascalParser.Arr2DContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#arr2D}.
	 * @param ctx the parse tree
	 */
	void exitArr2D(pascalParser.Arr2DContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#typearray}.
	 * @param ctx the parse tree
	 */
	void enterTypearray(pascalParser.TypearrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typearray}.
	 * @param ctx the parse tree
	 */
	void exitTypearray(pascalParser.TypearrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(pascalParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(pascalParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#constBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstBlock(pascalParser.ConstBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#constBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstBlock(pascalParser.ConstBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(pascalParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(pascalParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#constCharDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstCharDecl(pascalParser.ConstCharDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#constCharDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstCharDecl(pascalParser.ConstCharDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#constStrDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstStrDecl(pascalParser.ConstStrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#constStrDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstStrDecl(pascalParser.ConstStrDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(pascalParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(pascalParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(pascalParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(pascalParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(pascalParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(pascalParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(pascalParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(pascalParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#varParamBlock}.
	 * @param ctx the parse tree
	 */
	void enterVarParamBlock(pascalParser.VarParamBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#varParamBlock}.
	 * @param ctx the parse tree
	 */
	void exitVarParamBlock(pascalParser.VarParamBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#varParamDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarParamDecl(pascalParser.VarParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#varParamDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarParamDecl(pascalParser.VarParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#varParamID}.
	 * @param ctx the parse tree
	 */
	void enterVarParamID(pascalParser.VarParamIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#varParamID}.
	 * @param ctx the parse tree
	 */
	void exitVarParamID(pascalParser.VarParamIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#typeParamDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamDef(pascalParser.TypeParamDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typeParamDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamDef(pascalParser.TypeParamDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#typeParamName}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamName(pascalParser.TypeParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#typeParamName}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamName(pascalParser.TypeParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#fuctionUsage}.
	 * @param ctx the parse tree
	 */
	void enterFuctionUsage(pascalParser.FuctionUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#fuctionUsage}.
	 * @param ctx the parse tree
	 */
	void exitFuctionUsage(pascalParser.FuctionUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#paramsusable}.
	 * @param ctx the parse tree
	 */
	void enterParamsusable(pascalParser.ParamsusableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#paramsusable}.
	 * @param ctx the parse tree
	 */
	void exitParamsusable(pascalParser.ParamsusableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(pascalParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(pascalParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#whileDecla}.
	 * @param ctx the parse tree
	 */
	void enterWhileDecla(pascalParser.WhileDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#whileDecla}.
	 * @param ctx the parse tree
	 */
	void exitWhileDecla(pascalParser.WhileDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(pascalParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(pascalParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#codition2}.
	 * @param ctx the parse tree
	 */
	void enterCodition2(pascalParser.Codition2Context ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#codition2}.
	 * @param ctx the parse tree
	 */
	void exitCodition2(pascalParser.Codition2Context ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(pascalParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(pascalParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#forDecla}.
	 * @param ctx the parse tree
	 */
	void enterForDecla(pascalParser.ForDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#forDecla}.
	 * @param ctx the parse tree
	 */
	void exitForDecla(pascalParser.ForDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#forcondition}.
	 * @param ctx the parse tree
	 */
	void enterForcondition(pascalParser.ForconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#forcondition}.
	 * @param ctx the parse tree
	 */
	void exitForcondition(pascalParser.ForconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#idfor}.
	 * @param ctx the parse tree
	 */
	void enterIdfor(pascalParser.IdforContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#idfor}.
	 * @param ctx the parse tree
	 */
	void exitIdfor(pascalParser.IdforContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#valuesfor}.
	 * @param ctx the parse tree
	 */
	void enterValuesfor(pascalParser.ValuesforContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#valuesfor}.
	 * @param ctx the parse tree
	 */
	void exitValuesfor(pascalParser.ValuesforContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#repeatBlock}.
	 * @param ctx the parse tree
	 */
	void enterRepeatBlock(pascalParser.RepeatBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#repeatBlock}.
	 * @param ctx the parse tree
	 */
	void exitRepeatBlock(pascalParser.RepeatBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#repeatDecla}.
	 * @param ctx the parse tree
	 */
	void enterRepeatDecla(pascalParser.RepeatDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#repeatDecla}.
	 * @param ctx the parse tree
	 */
	void exitRepeatDecla(pascalParser.RepeatDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#repeatcondition}.
	 * @param ctx the parse tree
	 */
	void enterRepeatcondition(pascalParser.RepeatconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#repeatcondition}.
	 * @param ctx the parse tree
	 */
	void exitRepeatcondition(pascalParser.RepeatconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(pascalParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(pascalParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#ifDecla}.
	 * @param ctx the parse tree
	 */
	void enterIfDecla(pascalParser.IfDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#ifDecla}.
	 * @param ctx the parse tree
	 */
	void exitIfDecla(pascalParser.IfDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#ifcondition}.
	 * @param ctx the parse tree
	 */
	void enterIfcondition(pascalParser.IfconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#ifcondition}.
	 * @param ctx the parse tree
	 */
	void exitIfcondition(pascalParser.IfconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#conditionvali}.
	 * @param ctx the parse tree
	 */
	void enterConditionvali(pascalParser.ConditionvaliContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#conditionvali}.
	 * @param ctx the parse tree
	 */
	void exitConditionvali(pascalParser.ConditionvaliContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#cond2}.
	 * @param ctx the parse tree
	 */
	void enterCond2(pascalParser.Cond2Context ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#cond2}.
	 * @param ctx the parse tree
	 */
	void exitCond2(pascalParser.Cond2Context ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#array_call}.
	 * @param ctx the parse tree
	 */
	void enterArray_call(pascalParser.Array_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#array_call}.
	 * @param ctx the parse tree
	 */
	void exitArray_call(pascalParser.Array_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#arraybi_call}.
	 * @param ctx the parse tree
	 */
	void enterArraybi_call(pascalParser.Arraybi_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#arraybi_call}.
	 * @param ctx the parse tree
	 */
	void exitArraybi_call(pascalParser.Arraybi_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#arraybi1}.
	 * @param ctx the parse tree
	 */
	void enterArraybi1(pascalParser.Arraybi1Context ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#arraybi1}.
	 * @param ctx the parse tree
	 */
	void exitArraybi1(pascalParser.Arraybi1Context ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#arraybi2}.
	 * @param ctx the parse tree
	 */
	void enterArraybi2(pascalParser.Arraybi2Context ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#arraybi2}.
	 * @param ctx the parse tree
	 */
	void exitArraybi2(pascalParser.Arraybi2Context ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#read_function}.
	 * @param ctx the parse tree
	 */
	void enterRead_function(pascalParser.Read_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#read_function}.
	 * @param ctx the parse tree
	 */
	void exitRead_function(pascalParser.Read_functionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 */
	void enterIdRead(pascalParser.IdReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 */
	void exitIdRead(pascalParser.IdReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 */
	void enterArrayRead(pascalParser.ArrayReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 */
	void exitArrayRead(pascalParser.ArrayReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraybiRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 */
	void enterArraybiRead(pascalParser.ArraybiReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraybiRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 */
	void exitArraybiRead(pascalParser.ArraybiReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#write_function}.
	 * @param ctx the parse tree
	 */
	void enterWrite_function(pascalParser.Write_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#write_function}.
	 * @param ctx the parse tree
	 */
	void exitWrite_function(pascalParser.Write_functionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 */
	void enterIdWrite(pascalParser.IdWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 */
	void exitIdWrite(pascalParser.IdWriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 */
	void enterArrayWrite(pascalParser.ArrayWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 */
	void exitArrayWrite(pascalParser.ArrayWriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraybiWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 */
	void enterArraybiWrite(pascalParser.ArraybiWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraybiWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 */
	void exitArraybiWrite(pascalParser.ArraybiWriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idText}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 */
	void enterIdText(pascalParser.IdTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idText}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 */
	void exitIdText(pascalParser.IdTextContext ctx);
}