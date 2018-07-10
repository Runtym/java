package test09;

public class InitTest {
	int n = 10;
	String str = "abc";
	
	int getInt() {
		return this.n;
	}
	public static void main(String[] args) {
		InitTest it = new InitTest();
		it.n = 30;
		System.out.println(it.getInt());
		it = new InitTest();
		System.out.println(it.getInt());
		
	}
}
