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
				System.out.println("Enter first value !"+"\r");
				first = sc.nextDouble();
				System.out.println("Enter operation!"+"\r");
				operation = sc.next();
				System.out.println("Enter second value !"+"\r");
				second = sc.nextDouble();
				new Calculator(first, operation, second);
				System.out.println("Do you want exit ?"+"\r");
				System.out.println("Press 'Y' to exit / Press 'N' to continue !"+"\r");
				if(sc.next().equals("[yY]")) break;
				else if(sc.next().equals("[nN]"))
					System.out.println("Clear 'result' ?"+"\r");
					break;
				
				

			}
		} finally {
			sc.close();
		}

	}

}
