public class Calculator {
	private double first;
	private double second;
	private String operation;
	private double result;

	public Calculator(Double f, String el, Double s) {
		this.operation = el;
		this.first = f;
		this.second = s;		

	}

	public double calc() {
		
		switch (operation) {
		case "+":
			result = first + second;			
			break;
		case "-":
			result = first - second;			
			break;
		case "*":
			result = first * second;			
			break;
		case "/":
			result = first / second;			
			break;
		case "e":
			result = Math.pow(first, second);			
			break;
		default:
			result = 0;
			break;
						
		}
		return result;
	}

	

}