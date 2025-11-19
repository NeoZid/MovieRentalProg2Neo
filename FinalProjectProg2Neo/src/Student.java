
public class Student extends Person {
	String grade;
	
	public Student(int personID, String name, int age, String gender, String grade) {
		super(personID, name, age, gender);
		this.grade=grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
