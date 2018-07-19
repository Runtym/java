package test24;

public class FinallyTest {
	public static void main(String[] args) {
		String numStr = "12a";
		
		try {
			int num = Integer.parseInt(numStr);
			System.out.println(numStr + "은 숫자가 맞네");
		}catch(Exception e) {
			System.out.println(numStr + "은 숫자가 아닌디??");
		}finally {
			System.out.println("나한테 " + numStr + "이 숫자든 문자든 상관하지 없어!");
		}
		
	}
}
