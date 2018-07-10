package test09;

public class InitTest2 {
	String str = "abc";
	
	public static void main(String[] args) {
		InitTest it = new InitTest();
		InitTest2 it2 = new InitTest2();
		System.out.println(it.str==it2.str);
		String str = "abc";
		System.out.println(it.str==str);
	}
}
