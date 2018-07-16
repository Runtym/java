package test21;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<String>();
		System.out.println(strList.size());
		strList.add("박경훈");
		strList.add("전승현");
		strList.add("김기섭");
		System.out.println(strList.size());
		strList.remove("김기섭");
		System.out.println(strList.size());
		
		int idx = strList.indexOf("김기섭");
		System.out.println(idx);
	}
}
