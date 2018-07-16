package test19;

public class Animal implements Action{

	@Override
	public void eat() {
		System.out.println("동물이 밥먹습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("동물이 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void hunt() {
		System.out.println("동물이 사냥합니다.");
	}
}
