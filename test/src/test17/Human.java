package test17;

public class Human {
	protected String name;
	protected int age;
	public int num;
	
	public Human(String name, int age,int num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}
	
	public void printHuman() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("번호 : " + num);
	}
	
	//이 휴먼 클래스를 상속받아
	// printHuman()함수를 실행했을때 휴먼에 있는 함수가 아니라
	// 상속받은 클래스의 printHuman()의 무언가를 실행하면서 + 
	// 휴먼에 있는 printHuman()도 실행되게 코드를 작성해주세요.
}
