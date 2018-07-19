package test24;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("abc1");
		strList.add("abc2");
		strList.add("abc3");
		strList.add("abc4");
		int idx = 1;
		for(int i=0;i<strList.size();i++) {
			String str = strList.get(i);
			System.out.println("삭제 전 : " + strList);
			if(str.equals("abc" + idx++)) {
				strList.remove(i);
				i--;
			}
			System.out.println("삭제 후 : " + strList);
		}
	}
}
