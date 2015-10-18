
public class Calculator {
	private double first;
	private double second;
	private String element;
	static double result;

	public Calculator(Double f,String el,Double s){
		this.element=el;
		switch(element){
		case "+":
			this.first=f;
			this.second=s;
			result=first+second;
			System.out.println(result);
			break;
		case "-":
			this.first=f;
			this.second=s;
			result=first-second;
			System.out.println(result);
			break;
		case "*":
			this.first=f;
			this.second=s;
			result=first*second;
			System.out.println(result);
			break;
		case "/":
			this.first=f;
			this.second=s;
			result=first/second;
			System.out.println(result);
			break;
		case "e":
			this.first=f;
			this.second=s;
			result=Math.pow(first, second);
			System.out.println(result);
			break;
		}		
	}	
	
}
