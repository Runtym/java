package test17;


public class ToStringInObject {
	
	public String toString() {
		return "난 나만의 투스트링임!!";
	}
	public static void print(String someText) {
		String str = someText.toString();
		System.out.println(str);
	}
	
	public static void print(Object someObject) {
		String str = someObject.toString();
		System.out.println(str);
	}
	public static void main(String[] args) {
		String str = "나나나~~";
		print(str);
		ToStringInObject test = new ToStringInObject();
		print(test);
	}
}
