public class Calculate {
	public static void main(String[] args) {
		
		double first=Double.parseDouble(args[0]);
		String el=args[1];		
		double second=Double.parseDouble(args[2]);	
		new Calculator(first, el, second);
		
	}
}