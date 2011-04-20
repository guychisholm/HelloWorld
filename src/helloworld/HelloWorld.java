package helloworld;

public class HelloWorld {

	public static int toPower(int base, int exponent) {
		int result = base;
		
		for (int i = 1; i < exponent; i++) {
			base = result * base;
		}
		
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int tempvar = toPower(3,2);
		System.out.println(tempvar);
	}
	
	

}
