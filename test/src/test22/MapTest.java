package test22;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("이름","박경훈");
		hm.put("이름 ","조현경");
		hm.put("주소","서울 강서구 등촌1동");
		hm.put("애완동물이름","동동이");
		
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String str = "key = " + key +", value = " + hm.get(key);
			System.out.println(str);
		}
	}
}
