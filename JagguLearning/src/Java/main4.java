package Java;

public class main4 {
		public static void main(String[] args) {
			Shape s1 = new Circle(5);
			Shape s2 = new Rectangle(4, 6);
			Shape s3 = new Triangle(6, 9);
			
			System.out.printf("Calculate area: .%.2f%n",s1.calculateArea());
			System.out.printf("Calculate area: .%.2f%n",s2.calculateArea());
			System.out.printf("Calculate area: .%.2f%n",s3.calculateArea());
			
		}
	}

