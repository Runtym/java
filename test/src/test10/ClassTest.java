package test10;

public class ClassTest {
	int num;
	String str;
	
	public void test() {
		System.out.println(this.num);
	}
	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		ct.num = 10;
		ct.test();
		
	}
}
