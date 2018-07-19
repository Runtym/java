package test24;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> mList = 
				new ArrayList<HashMap<String,String>>();
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("name", "김길동");
		mList.add(hm);
		hm = new HashMap<String,String>();
		hm.put("name", "이길동");
		mList.add(hm);
		hm = new HashMap<String,String>();
		hm.put("name", "홍길동");
		mList.add(hm);
		
		for(int i=0;i<mList.size();i++) {
			HashMap<String,String> m = mList.get(i);
			String name = m.get("name");
			if(name.equals("홍길동")) {
				System.out.println("홍길동님은 " + i + "번 위치에 있음!");
				mList.remove(i);
			}
		}
		System.out.println(mList);
	}
}
