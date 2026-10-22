package Java;

public class Employee {
	double salary = 20000;
	
	void calculateSalary() {
		System.out.println("Employee: " + salary);
	} 
}

class Manager extends Employee {
	@Override
	void calculateSalary() {
		double total = salary + 10000;
		System.out.println("Manager Salary: " + total);
	}
}

class Developer21 extends Employee {
	@Override
	void calculateSalary() {
		double total = salary + 5000;
		System.out.println("Developer Salary: " + total);
	}
}
