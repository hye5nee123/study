package hw;

class Person {
	private String name;

	public Person(String name) {
	this.name = name;
}

	public String getName() {
		return name;
	}
}

class Student extends Person {
	private int id;

	public Student(int id) {
	   super("학생"); 
	   this.id = id;
   }

	public int getid() {
		return id;
	}

}

public class HW02 {
	public static void main(String[] args) {
		Student student = new Student(123);
		System.out.println(student.getid());
		System.out.println(student.getName());
	}
}