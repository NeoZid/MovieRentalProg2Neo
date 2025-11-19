import java.util.ArrayList;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<Student> students = new ArrayList<>();
		while (flag) {
			Scanner in = new Scanner(System.in);
			System.out.println("1-Add a student? 2-Show students, 3- Exit");
			int choice = in.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Student ID");
				int personID = in.nextInt();
				System.out.println("Enter name");
				String name = in.next();
				System.out.println("Enter age");
				int age = in.nextInt();
				System.out.println("Enter gender");
				String gender = in.next();
				System.out.println("Enter grade");
				String grade = in.next();
				// Student s1 = new Student(personID, name, age, gender, grade);
				// students.add(s1);
				break;
			case 2:
				
			}
			
		}
	}

}
