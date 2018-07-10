package test12;

public class Son extends Father{

	void work(int a) {
		System.out.println("난 개발일을 하지~");
	}
	
	String work(String a) {
		return "abc";
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		
	}
}
