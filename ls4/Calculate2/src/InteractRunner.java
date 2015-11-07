import java.util.Scanner;

public class InteractRunner {

	/*
	 * Через консоль в цикле вводится первое значение, тип операции, второе значение.
	 * Если ввести первое и второе значение не цифрами цикл прерывается и стартует с метки 'start:' 
	 * Возвращается результат арифмет. операции. 
	 * Вопрос работать далее.
	 * или выйти(завершение работы) Вопрос сохранить результат пред. выч. для
	 * дальн. исп. или нет(возвращение на начало цикла). Результат
	 * устанавливается в первое значение и далее по циклу
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Создаем поток ввода через
												// консоль
		Calculator calculator = new Calculator(); // Создаем экземпляр класса

		while (true)
			start: {

				if (!calculator.isSave()) { // Если результат пред. вычисл. не
											// сохранен
					try {
						System.out.println("Enter first value"); // вводим первое значение																
						calculator.setFirst(Double.parseDouble(sc.next())); // Перевод string в double
						System.out.println("Enter symbol 'operation' (+-*/e)"); // Ввод типа операции
						calculator.setOperation(sc.next());

					} catch (Exception e) {					// Ловим exception если введено значение не соответствующее цифрам
						System.out.println("Вводите цифры");
						break start;						
					}

				}

				try {
					System.out.println("Enter second value"); // Ввод второго значения
					calculator.setSecond(Double.parseDouble(sc.next())); // Перевод string в double
				} catch (Exception e) {						// Ловим exception если введено значение не соответствующее цифрам
					System.out.println("Вводите цифры");	
					break start;							// Цикл прерывается и стартует с метки 'start:' 
				}
				System.out.println("Result: " + calculator.calc()); // Вывод result

				System.out.println("Enter 'y' to exit/ or enter " // Ввести 'y' если выйти, или ввести любой символ для продолжения
									 + "any symbol to continue !"); 														 

				if (sc.next().equals("y")) { // Если параметр равен 'y'  завершение программы иначе продолжаем работать
					System.out.println("Bye bye"); 
					break; 	
				}

				else { 
					System.out.println("Enter symbol 'y' not save " 		// Ввести 'y' не сохранять результат, или ввести любой символ для дальн. испох 'result'
							+ "'result'/ enter any symbol 'result' use next?"); 
					if (!sc.next().equals("y")) { // Если параметр не равен 'y' result сохраняется и исп. далее	в качестве 'first'. Иначе цикл начинается сначала					
						calculator.setSave(true); 			 
						calculator.setFirst(calculator.getResult()); 													
					} 
				}

			}

	}

}
