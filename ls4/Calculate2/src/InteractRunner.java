import java.util.Scanner;

public class InteractRunner {
	
/*
 * Через консоль в цикле вводится первое значение, тип операции, второе значение.
 * Возвращается результат арифмет. операции.
 * Вопрос работать далее или выйти(завершение работы)
 * Вопрос сохранить результат пред. выч. для дальн. исп. или нет(возвращение на начало цикла).
 * Результат устанавливается в первое значение и далее по циклу 
*/	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);						// Создаем поток ввода через консоль
		Calculator calculator = new Calculator();					// Создаем экземпляр класса

		while (true) {

			if (!calculator.isSave()) {								// Если результат пред. вычисл. не сохранен
				System.out.println("Enter first value");			// вводим первое значение
				calculator.setFirst(Double.parseDouble(sc.next())); // Перевод string в double
			}

			System.out.println("Enter symbol 'operation' (+-*/e)");	// Ввод типа операции
			calculator.setOperation(sc.next());

			System.out.println("Enter second value");				// Ввод второго значения
			calculator.setSecond(Double.parseDouble(sc.next())); 	// Перевод string в double
			System.out.println("Result: " + calculator.calc());		// Вывод result

			System.out.println("Enter 'y' to exit/ or enter "		// Ввести 'y' если выйти, 
								  +"any symbol to continue !");		// или ввести любой символ для продолжения			
																		
			if (sc.next().equals("y")) {							// Если параметр равен 'y'
				System.out.println("Bye bye");						// завершение программы
				break;												// иначе продолжаем работать
			} 
			
			else {													// Ввести 'y' не сохранять результат,
				System.out.println("Enter symbol 'y' not save "		// или ввести любой символ	
			   +"'result'/ enter any symbol 'result' use next?");	// для дальн. исп. результата	
				
				if (!sc.next().equals("y")) {						// Если параметр не равен 'y'
					calculator.setSave(true);;						// result сохраняется и исп. далее
					calculator.setFirst(calculator.getResult());	// в качестве 'first'
				}													// Иначе цикл начинается сначала	
			}

		}

	}

}
