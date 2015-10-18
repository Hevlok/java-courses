import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double first;
		double second;
		String operation;
		double result = 0;
		boolean res = false;

		try {
			while (true) {
				if (res) {
					first = result;
				} else {
					System.out.println("Enter first value !"); // Ввод первого
																// значения
					first = sc.nextDouble();
				}

				System.out.println("Select operation: (+ - * / e)"); // Указание
																		// операции
																		// вычисления
				operation = sc.next();

				System.out.println("Enter second value !"); // Ввод второго
															// значения
				second = sc.nextDouble();
				result = new Calculator(first, operation, second).calc();
				System.out.println(result); // Вывод
											// результата
											// операции

				System.out.println("Press 'y' to exit / Press any symbol to continue !");// Выйти
																							// или
																							// продолжить
				String st = sc.next();// Проверка выйти или
										// продолжить
				if (st.equals("y")) {
					System.out.println("Buy buy");
					break;
				} else {
					System.out.println("Press 'y' to clear 'result' / Press any symbol 'result' save and use !");
					if (!sc.next().equals("y")) {
						res = true;
					} else {
						res=false;
					}
				}

			} 
		} finally {
			sc.close();
		}

	}

}
