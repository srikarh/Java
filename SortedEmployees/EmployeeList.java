package SortedEmployees;
import java.util.*;

public class EmployeeList {

	
	public static void main(String[] args) {
		ArrayList<Employee> directory = new ArrayList<Employee>();
		
		Scanner reader = new Scanner(System.in);  
		for (int i=0; i<10; i++){
			System.out.println("Type Name, then age, then address of employee " + (i + 1));
			String name = reader.nextLine();
			int age = reader.nextInt();
			reader.nextLine();
			String address = reader.nextLine();
			directory.add(new Employee(name, age, address));
		}
		reader.close();
		for (int i = 0; i < directory.size() - 1; i++) {
			for (int x = 0; x < directory.size() - i - 1; x++) {
				if (directory.get(x).name.compareTo(directory.get(x+1).name) > 0) {
					String first = directory.get(x).name;
					String second = directory.get(x + 1).name;
					directory.get(x).name = second;
					directory.get(x + 1).name = first;
					
				}
			}
		}
		for (Employee e : directory) {
			System.out.println(e.name);
		}
	}

}
