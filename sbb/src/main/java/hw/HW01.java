package hw;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + "가 짖습니다: 멍멍!");
    }
}

public class HW01 {
    public static void main(String[] args) {
        Dog dog = new Dog("바우와우");
        dog.bark();
    }
}
