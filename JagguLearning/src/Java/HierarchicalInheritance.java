package Java;
class Animal2{
	void wakeUp() {
		System.out.println("Wake up");
	}
}
class Cat extends Animal2 {
	void meow() {
	System.out.println("Meow");
}
}
class Rat extends Animal2{
	void run() {
		System.out.println("Rat is running");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.wakeUp();
		c.meow();
		
		Rat r = new Rat();
		r.wakeUp();
		r.run();

	}
}

