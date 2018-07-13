package test17;

public class MinWoo extends Human{
	MinWoo(String name, int age, int num){
		super(name, age, num);
	}
	public void printHuman() {
		System.out.println("난 " + name + "이라고 해~ 내 소개를 들어볼래?");
		super.printHuman();
	}
	
	public static void main(String[] args) {
		MinWoo mw = new MinWoo("강민우", 28, 1);
		mw.printHuman();
	}
}
