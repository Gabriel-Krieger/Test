public class Calculator {
	static int solution;

	public static int calculator(int num1, char operator, int num2) {
		if(operator == '+') {
			solution = num1 + num2;
			} else if(operator == '-') {
			solution = num1 - num2;
		} else if(operator == '*') {
			solution = num1 * num2;
		} else if(operator == '/') {
			solution = num1 / num2;
		}
		return solution;
  }
	
	public static void main(String args[]) {
		System.out.println(calculator(5, '*', 2));
	}
}