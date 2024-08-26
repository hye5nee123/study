package hw;

class Person {

	public String name;
	
	public String getName(String name) {
		return name;
	}
	
}

class Student extends Person {

	public int id;
	
	public Student(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
}

public class HW02 {

	public static void main(String[] args) {
		Student student = new Student(123);
		System.out.println(student.getId());
	}
}
