package test19;


public class StaticTest {
	static final int a = 10;
	
	public static void main(String[] args) {
		System.out.println(a);
		StaticTest st = new StaticTest();
		System.out.println(st.a);
	}
}
