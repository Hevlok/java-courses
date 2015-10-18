
public class Calculator {
	private double first;
	private double second;
	private String element;

	public Calculator(Double f,String el,Double s){
		this.element=el;
		switch(element){
		case "+":
			this.first=f;
			this.second=s;
			System.out.println(first+second);
			break;
		case "-":
			this.first=f;
			this.second=s;
			System.out.println(first-second);
			break;
		case "u":
			this.first=f;
			this.second=s;
			System.out.println(first*second);
			break;
		case "/":
			this.first=f;
			this.second=s;
			System.out.println(first/second);
			break;
		case "e":
			this.first=f;
			this.second=s;
			System.out.println(Math.pow(first, second));
			break;
		}		
	}	
	
}
