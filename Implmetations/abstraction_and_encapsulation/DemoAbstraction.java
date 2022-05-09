package abstraction_and_encapsulation;

abstract class Shape {
	abstract void draw();
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class DemoAbstraction{
	public static void main(String args[]) {
		Shape s=new Circle();
		Shape s1=new Rectangle();
		s.draw();
		s1.draw();
	}
}
