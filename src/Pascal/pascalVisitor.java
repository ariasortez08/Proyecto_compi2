// Generated from C:/Users/miria/IdeaProjects/Compilador/src/Grammar/pascal.g4 by ANTLR 4.13.2
package Pascal;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pascalParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(pascalParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(pascalParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typesstatemes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesstatemes(pascalParser.TypesstatemesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(pascalParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(pascalParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(pascalParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(pascalParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayCallExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCallExpression(pascalParser.ArrayCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayBiCallExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBiCallExpression(pascalParser.ArrayBiCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValuesExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesExpression(pascalParser.ValuesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivModExpression}
	 * labeled alternative in {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExpression(pascalParser.MulDivModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#assingId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingId(pascalParser.AssingIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#optional_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_values(pascalParser.Optional_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBlock(pascalParser.VarBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(pascalParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(pascalParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(pascalParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(pascalParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrDecl(pascalParser.ArrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arr1D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr1D(pascalParser.Arr1DContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arr2D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr2D(pascalParser.Arr2DContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typearray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypearray(pascalParser.TypearrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(pascalParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBlock(pascalParser.ConstBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(pascalParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constCharDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstCharDecl(pascalParser.ConstCharDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constStrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStrDecl(pascalParser.ConstStrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(pascalParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(pascalParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(pascalParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(pascalParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varParamBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParamBlock(pascalParser.VarParamBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varParamDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParamDecl(pascalParser.VarParamDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varParamID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParamID(pascalParser.VarParamIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeParamDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamDef(pascalParser.TypeParamDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeParamName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamName(pascalParser.TypeParamNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#fuctionUsage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuctionUsage(pascalParser.FuctionUsageContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#paramsusable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsusable(pascalParser.ParamsusableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(pascalParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#whileDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDecla(pascalParser.WhileDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(pascalParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#codition2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodition2(pascalParser.Codition2Context ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(pascalParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#forDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDecla(pascalParser.ForDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#forcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForcondition(pascalParser.ForconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#idfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdfor(pascalParser.IdforContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#valuesfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesfor(pascalParser.ValuesforContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#repeatBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatBlock(pascalParser.RepeatBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#repeatDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatDecla(pascalParser.RepeatDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#repeatcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatcondition(pascalParser.RepeatconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(pascalParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#ifDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDecla(pascalParser.IfDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#ifcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcondition(pascalParser.IfconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#conditionvali}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionvali(pascalParser.ConditionvaliContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#cond2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond2(pascalParser.Cond2Context ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#array_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_call(pascalParser.Array_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arraybi_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybi_call(pascalParser.Arraybi_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arraybi1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybi1(pascalParser.Arraybi1Context ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arraybi2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybi2(pascalParser.Arraybi2Context ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#read_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_function(pascalParser.Read_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdRead(pascalParser.IdReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRead(pascalParser.ArrayReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraybiRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybiRead(pascalParser.ArraybiReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#write_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_function(pascalParser.Write_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdWrite(pascalParser.IdWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayWrite(pascalParser.ArrayWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraybiWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybiWrite(pascalParser.ArraybiWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idText}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdText(pascalParser.IdTextContext ctx);
}