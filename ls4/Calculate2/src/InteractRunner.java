import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double first;
		double second;
		String operation;
		String s = "NO";

		try {
			while (s.equals("NO")) {
				System.out.println("Enter first value !");
				first = sc.nextDouble();
				System.out.println("Select operation: (+ - * / e)");
				operation = sc.next();
				System.out.println("Enter second value !");
				second = sc.nextDouble();
				System.out.println(new Calculator(first, operation, second).calc());
				System.out.println("Do you want exit ?");
				System.out.println("Press 'Y' to exit / Press 'N' to continue !");
				if (sc.next().equals("[yY]"))
					break;
				else if (sc.next().equals("[nN]"))
					System.out.println("Clear 'result' ?");
				break;

			}
		} finally {
			sc.close();
		}

	}

}
