package test19;

public class Person implements Action{

	@Override
	public void eat() {
		System.out.println("사람이 밥먹습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("사람이 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	
	public void work() {
		System.out.println("사람이 일을 합니다.");
	}
}
