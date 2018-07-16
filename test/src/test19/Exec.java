package test19;

public class Exec {
	
	public static void eat(Action p) {
		p.eat();
	}
	public static void main(String[] args) {
		Action act = new Animal();
		eat(act);
		eat(new Animal());
		eat(new Person());
	}
}
