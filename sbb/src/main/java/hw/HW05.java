package hw;

class Animal2 {
    public void sound() {
        System.out.println("mmmm");
    }
}

class Cat extends Animal2 {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public void parentSound() {
        super.sound(); // 부모 클래스의 sound 메서드 호출
    }
}

public class HW05 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();       // "Meow" 출력
        cat.parentSound(); // "Animal sound" 출력
    }
}
