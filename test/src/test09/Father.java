package test09;

public class Father {
	
	public static void main(String[] args) {
		Son s = new Son();
		s.test();
	}
	public void test() {
		System.out.println("아빠의 테스트 함수!");
	}
	public void run() {
		System.out.println("아빠가 달려!!");
	}
	public void sleep() {
		System.out.println("아빠가 자~");
	}
}
