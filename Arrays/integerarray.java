package Arrays;

import java.util.*;

public class integerarray {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers: ");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int a = sc.nextInt();
			numbers.add(a);
		}
		sc.close();
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum += numbers.get(i);
		}
		System.out.println(sum);
	}
}
