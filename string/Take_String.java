package string;

import java.util.*;

public class Take_String {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner cs = new Scanner(System.in);
		System.out.println("How many strings: ");
		int number = cs.nextInt();
		cs.nextLine();
		for (int i = 0; i < number; i++) {
			String a = cs.nextLine();
			words.add(a);
		}
		cs.close();
		StringBuilder compile = new StringBuilder("");
		for (int i = 0; i < number; i++) {
			compile.append(words.get(i) + " ");
		}
		System.out.println(compile);
	}

}
