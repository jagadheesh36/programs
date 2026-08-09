package Java;
class Animal1{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("Barking");
	}
}
class Puppy extends Dog1 {
	void play() {
		System.out.println("Puppy is playing");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.play();

	}

}
