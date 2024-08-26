package hw;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class HW03 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("Red", 2, 3);
        Circle cir = new Circle("Blue", 2);

        System.out.println("Rectangle area: " + rec.area());
        System.out.println("Circle area: " + cir.area());
    }
}
