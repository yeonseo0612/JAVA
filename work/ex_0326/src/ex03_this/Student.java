package ex03_this;

public class Student {
	String name;
	int age;
	int studentID;
	
	public Student(String name, int age, int studentID) {
		this.name = name;
		this.age  = age;
		this.studentID = studentID;
		
	}
	public void StudentNameInfo() {
		System.out.printf(name, age, studentID);
	}
}
