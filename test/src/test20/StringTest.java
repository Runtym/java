package test20;

public class StringTest {

	public static void main(String[] args) {
		String str = "1";
		str += ",2";
		str += ",3";
		str += ",4";
		str += ",5";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();
		sb.append("1");
		sb.append(",2");
		sb.append(",3");
		sb.append(",4");
		sb.append(",5");
		str = sb.toString();
		System.out.println(str);
	}
}
