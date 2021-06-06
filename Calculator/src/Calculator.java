public class Calculator {
	static int solution;

	public static int calculator(int num1, char operator, int num2) {
		try {
		if(operator == '+') {
			solution = num1 + num2;
			} else if(operator == '-') {
			solution = num1 - num2;
		} else if(operator == '*') {
			solution = num1 * num2;
		} else if(operator == '/') {
			solution = num1 / num2;
		} else if(operator == '/' && num1 == 0) {
			solution = 0;
		} else if(operator == '/' && num2 == 0) {
			solution = 0;
		}
		return solution;
		} catch(ArithmeticException e) {
		return 0;
		}
		
  }
	
	public static void main(String args[]) {
		System.out.println(calculator(4, '/', 0));
	}
}