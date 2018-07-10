package test12;

class Test{
	public String toString() {
		return "나도 출력되나?";
	}
}
public class PrintObject {
	String str = "poStr";
	
	public String toString() {
		return "이 클래스의 str이란 변수는 " + str + 
				"이라는 값을 가지고 있죠";
	}
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		String str = new String("str");
		System.out.println(str);
		PrintObject po = new PrintObject();
		System.out.println(po);
	}
}
