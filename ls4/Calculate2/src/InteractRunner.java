import java.util.Scanner;

public class InteractRunner {
	
/*
 * Через консоль в цикле вводится первое значение, тип операции, второе значение.
 * Возвращается результат операции.
 * Запрос работать далее или выйти(завершение работы)
 * Запрос сохранить результат пред. выч. для дальн. исп. или нет(возвращение на начало цикла).
 * Результат устанавливается в первое значение и далее по циклу 
*/	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);						//Создаем поток ввода через консоль
		Calculator calculator = new Calculator();

		while (true) {

			if (!calculator.isSave()) {								// Если результат пред. вычисл. не сохранен
				System.out.println("Enter first value");			// вводим первое значение
				calculator.setFirst(Double.parseDouble(sc.next())); 
			}

			System.out.println("Enter symbol 'operation' (+-*/e)");	// Ввод типа операции
			calculator.setOperation(sc.next());

			System.out.println("Enter second value");				// Ввод второго значения
			calculator.setSecond(Double.parseDouble(sc.next())); 
			System.out.println("Result: " + calculator.calc());

			System.out.println("Enter 'y' to exit/ or enter "		// Ввести 'y' если выйти, 
								  +"any symbol to continue !");		// или ввести любой символ для продолжения			
																		
			if (sc.next().equals("y")) {
				System.out.println("Bye bye");
				break;				
			} 
			
			else {													// Ввести 'y' не сохранять результат,
				System.out.println("Enter symbol 'y' not save "		// или ввести любой символ	
			   +"'result'/ enter any symbol 'result' use next?");	// для дальн. исп. результата	
				
				if (!sc.next().equals("y")) {				
					calculator.setSave(true);;
					calculator.setFirst(calculator.getResult());;
				}
			}

		}

	}

}
