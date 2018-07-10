package test09;
public class StaticTest {
	static int numSt = 10;
	int num1 = 20;
	int num2 = 20;
	int num3 = 20;
	
	public static void main(String[] args) {
		System.out.println(StaticTest.numSt);
		StaticTest st = new StaticTest();
		System.out.println(st.num1);
		Math.random();
	}
}
