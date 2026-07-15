package Java;

public class LogicalOperators {

	public static void main(String[] args) {
		int marks = 75;
		int attendence = 80;
		
		System.out.println("Eligible to pass: " + (marks >= 35 && attendence >=75));
		System.out.println("Write Exam: " + (marks >= 35 || attendence <=75));
		System.out.println("Not Failed: " + !(marks < 35));

	}

}
