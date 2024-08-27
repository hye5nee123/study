package com.mysite.javahw7;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    // Getter 메서드 추가
    public String getName() {
        return name;
    }
}

class Student {
    void printPersonName(Person person) {
        System.out.println("Name: " + person.getName()); // getter 메서드 사용
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John");
        Student student = new Student();
        student.printPersonName(person); // "Name: John" 출력
    }
}

