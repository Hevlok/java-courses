import java.util.Scanner;

public class InteractRunner {
	
/* опа опа 
 * ����� ������� � ����� �������� ������ ��������, ��� ��������, ������ ��������.
 * ������������ ��������� ��������.
 * ������ �������� ����� ��� �����(���������� ������)
 * ������ ��������� ��������� ����. ���. ��� �����. ���. ��� ���(����������� �� ������ �����).
 * ��������� ��������������� � ������ �������� � ����� �� ����� 
*/	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);						//������� ����� ����� ����� �������
		Calculator calculator = new Calculator();

		while (true) {

			if (!calculator.isSave()) {								// ���� ��������� ����. ������. �� ��������
				System.out.println("Enter first value");			// ������ ������ ��������
				calculator.setFirst(Double.parseDouble(sc.next())); 
			}

			System.out.println("Enter symbol 'operation' (+-*/e)");	// ���� ���� ��������
			calculator.setOperation(sc.next());

			System.out.println("Enter second value");				// ���� ������� ��������
			calculator.setSecond(Double.parseDouble(sc.next())); 
			System.out.println("Result: " + calculator.calc());

			System.out.println("Enter 'y' to exit/ or enter "		// ������ 'y' ���� �����, 
								  +"any symbol to continue !");		// ��� ������ ����� ������ ��� �����������			
																		
			if (sc.next().equals("y")) {
				System.out.println("Bye bye");
				break;				
			} 
			
			else {													// ������ 'y' �� ��������� ���������,
				System.out.println("Enter symbol 'y' not save "		// ��� ������ ����� ������	
			   +"'result'/ enter any symbol 'result' use next?");	// ��� �����. ���. ����������	
				
				if (!sc.next().equals("y")) {				
					calculator.setSave(true);;
					calculator.setFirst(calculator.getResult());;
				}
			}

		}

	}

}
