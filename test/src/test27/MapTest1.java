package test27;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest1 {
	static ArrayList<HashMap<String,String>> getList(){
		ArrayList<HashMap<String,String>> al = 
				new ArrayList<HashMap<String,String>>();
		for(int i=0;i<3;i++) {
			HashMap<String,String> hm = 
					new HashMap<String,String>();
			hm.put("name", "홍길동"+i);
			hm.put("age", "2"+i);
			al.add(hm);
		}
		return al;
	}
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> al = getList();
		for(HashMap<String,String> hm:al) {
			System.out.println(hm);
		}
		for(int i=0;i<al.size();i++) {
			HashMap<String,String> hm=al.get(i);
			System.out.println(hm);
		}
	}
}
