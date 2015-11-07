public class Calculator {
	private double first;			//Первое значение
	private double second;			//Второе значение
	private String operation;		//Тип операции
	private double result;			//Результат вычисления
	private boolean save=false;		//'true' сохранить результат для дальн. исп., 'false' не сохранять 
	
/*
 	Метод  'calc' выполняет разные типы арифметических операций, указанные через параметр 'operation'	
*/	
	public double calc() {
		
		switch (operation) {
		case "+":
			result = first + second; 			//Cложение			
			break;
		case "-":
			result = first - second;			//Вычитание			
			break;
		case "*":
			result = first * second;			//Умножение			
			break;
		case "/":
			result = first / second;			//Деление			
			break;
		case "e":
			result = Math.pow(first, second);	//Возведение в степень		
			break;
		default:
			result = 0; // В случае если будет введен любой неверный символ операции, метод вернет '0'.
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

	public boolean isSave() {
		return save;
	}

	public void setSave(boolean state) {
		this.save = state;
	}

	

	


	

}
