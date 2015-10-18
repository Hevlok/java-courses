import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		
		double first;
		double second;
		String operation;
		String s="NO";
		//System.out.printlsn("Enter first value !");
		while(s.equals("NO")){
			System.out.println("Enter first value !");			
			first=sc.nextDouble();
			System.out.println("Enter operation!");
			operation=sc.next();
			System.out.println("Enter second value !");
			second=sc.nextDouble();
			new Calculator(first, operation, second);
			
		}

	}

}
