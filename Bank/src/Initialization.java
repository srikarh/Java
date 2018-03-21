import java.util.Scanner;


public class Initialization {

	private static Scanner scanner = new Scanner( System.in );

	public static void main(String[] args) {

	System.out.println("What is your name?: ");
	String input = scanner.nextLine();
	Account S = new Account(input);

	System.out.println("How much do you want to credit?");
	int number = scanner.nextInt();
	S.credit(number);
	System.out.println("How much do you want to debit?");
	number = scanner.nextInt();
	S.debit(number);
	System.out.println("Here is your balance:" + S.showBalance());


	}

}