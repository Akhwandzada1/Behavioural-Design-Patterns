package InterpreterPatternHomeWork;

public class DifferenceExpression extends NonTerminalExpression {
	public DifferenceExpression(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}
	@Override
	public int interpret() {
		return leftExpression.interpret()-rightExpression.interpret();
	}
}
