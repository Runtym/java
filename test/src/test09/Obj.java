package test09;


public class Obj {
	
	static void printRun(Person p) {
		p.run();
	}
	public static void main(String[] args) {
		printRun(new Person(40));
		printRun(new Person(50));
		printRun(new Person(60));
	}
	
}
