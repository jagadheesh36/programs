package Java;

abstract class Shape {
	abstract double calculateArea();

}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
}
class Rectangle extends Shape{
	double length;
	double breadth;
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
		
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return length * breadth;
	}
	
}

class Triangle extends Shape{
	double base;
	double height;
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}
	}

