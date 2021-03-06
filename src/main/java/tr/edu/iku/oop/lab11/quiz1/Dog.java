package tr.edu.iku.oop.lab11.quiz1;

public class Dog extends Animal {

	public Dog(String name) {
		super(name, "White", 4, "Ruff");
	}

	public Dog(String name, String color) {
		super(name, color, 4, "Ruff");
	}

	@Override
	public void print() {
		System.out.println("            __");
		System.out.println("(\\,--------'()'--o");
		System.out.println(" (_    ___    /~\"");
		System.out.println("  (_)_)  (_)_)");
	}

}
