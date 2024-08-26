package hw;

class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus; 
    }
}

public class HW04 {
    public static void main(String[] args) {
        Manager manager = new Manager(100, 500);
        System.out.println("Manager's total salary: " + manager.getSalary());
    }
}
