package InterpreterPatternHomeWork;
public class InterpreterUtil {
	public static boolean isOperator(String i) {
		if(i.equals("+")||i.equals("-")||i.equals("*")||i.equals("/"))
			return true;
		else
			return false;
	}
	public static Expression getOperator(String i,Expression left,Expression right) {
		if(i.equals("+"))
			return new SumExpression(left,right);
	else if (i.equals("-"))
		return new DifferenceExpression(left,right);
	else if (i.equals("*"))
		return new ProductExpression(left,right);
	else
		return new DivisonExpression(left,right);
	}
}