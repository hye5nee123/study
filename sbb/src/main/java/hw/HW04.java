package hw;

class Employee {

	public int pay;
	
	void getSalary(int pay) {
		System.out.println(pay);
	}
}

class Manager extends Employee {

	public int bonus;
	
	void getSalary(int pay, int bonus) {
		System.out.println(pay + bonus);
	}
	
}

public class HW04 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.getSalary(100, 500);
	}
}
