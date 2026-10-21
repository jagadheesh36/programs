package Java;

public class A1 {
	A1(){
		System.out.println("A1 constructer");
	}

}

class B1 extends A1{
	B1(){
		System.out.println("B1 constructer");
	}
	B1(int x){
		this();
		System.out.println("B1 parametarized");
	}
}
class C1 extends B1 {
	C1(){
		super(10);
		System.out.println("C1 constructer");
	}
}

