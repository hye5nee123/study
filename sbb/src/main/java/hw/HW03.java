package hw;

class Shape {
	public String color;
	
	public String getColor() {
		return color;
		
	}
	
	public void area(int x, int y) {
		
	}
	
}

class Rectangle extends Shape {

	@Override
	public void area(int x, int y) {
		int area = x * y;
		System.out.println(area);
	}
	
}

class Circle extends Shape {
	
	@Override
	public void area(int x, int y) {
		double pie = Math.round(Math.PI * 100.0) / 100.0;
		double area = pie  * x * y;
		System.out.println(area);
	}
	
}

public class HW03 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();
		rec.area(2, 3);
		cir.area(2, 2);
	}
}
