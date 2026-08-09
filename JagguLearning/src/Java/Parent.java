package Java;
interface A {
	void show();
}
interface B {
	void display();
}
class C implements A, B {
	public void show() {
		System.out.println("A method");
	}
	public void display() {
		System.out.println("B method");
	}
	
}
class Parent {

	public static void main(String[] args) {
		C obj = new C();
		obj.show();
		obj.display();

	}

}
