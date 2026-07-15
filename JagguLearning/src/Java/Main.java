

public class Main {
	int id;
	String name;
	String emailId;
	String password;
	
	public void login() {
		System.out.println("Logging In");
	}
	
	public void logout() {
		System.out.println("Logging out");
	}
}
class Student extends User {
	int marks;
	Student(int a,String name,String emailId,String password,int m){
		id= a;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		marks = m;
	}
	
	public void dopractice() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("EmailId: " + emailId);
		System.out.println("PasswordL " + password);
		System.out.println("Marks: " + marks);
	}
}
class Trainer extends User{
	int noOfSessions;
	
	public void takeSession() {
		System.out.println("TakeSessions: " + noOfSessions);
	}
	
}
class Admin extends User {
	int Adminvar;
	
	public void manageApp() {
		System.out.println("Admin managing App");
	}
}

class Main{
	public static void main(String[] args) {
		User u1 = new User();
		
		Student s1 = new Student(123,"jaggu","jaggu@123","jaggu143",90);
		Trainer t1 = new Trainer();
		Admin a1 = new Admin();
	}
}





