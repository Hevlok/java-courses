
public class Calculator {
	private double first;
	private double second;
	private String operation;
	private double result;
	private boolean state=false;
	

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
	
	public double getFirst() {
		return first;
	}

	public void setFirst(double first) {
		this.first = first;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	

	


	

}
