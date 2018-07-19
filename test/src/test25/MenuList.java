package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuList {
	private static ArrayList<HashMap<String,String>> menuList
	 = new ArrayList<HashMap<String,String>>();
	private static Scanner s = new Scanner(System.in);
	
	public static int insertMenu(HashMap<String,String> menu) {
		menuList.add(menu);
		return 1;
	}
	

	public static void inputData() {
		//스캐너를 사용해서
		//mName(메뉴명), mPrice(가격), mCnt(인분) 을 받아
		// menuList에 추가하는 로직을 만들어주세요.
		HashMap<String, String> menu = new HashMap<String,String>();
		System.out.println("input menu!");
		menu.put("mName", s.nextLine());
		System.out.println("input price!");
		menu.put("mPrice", s.nextLine());
		System.out.println("input price!");
		menu.put("mCnt", s.nextLine());
		if(insertMenu(menu)==1) {
			System.out.println("추가 완료!");
		}else {
			System.out.println("추가 실패!");
		}
	}
	public static void selectMenuList() {
		for(HashMap<String, String> m : menuList) {
			System.out.println("메뉴 : " + m);
		}
	}
	public static void main(String[] args) {
		inputData();
		selectMenuList();
	}
}
