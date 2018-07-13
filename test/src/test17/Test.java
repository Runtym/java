package test17;

class TopTest{
	void test() {
		System.out.println("난 탑이지!!");
	}
	public String abc() {
		return "난 탑이지!!";
	}
}
public class Test extends TopTest{

	void test() {
		System.out.println("난 노멀하지!!");
	}
	public String abc() {
		return "난 노멀하지!!";
	}
	
	public static void main(String[] args) {
		TopTest tt = new Test();
		tt.test();
		System.out.println(tt);
	}
}
