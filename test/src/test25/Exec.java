package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.impl.UserDAOImpl;

public class Exec {

	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		ArrayList<HashMap<String, String>> userList = 
				udao.selectUserInfoList(null);
		System.out.println(userList);
		HashMap<String,String> userInfo = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("몇명 등록하실래요?");
		int max = Integer.parseInt(scan.nextLine());
		for(int i=0;i<max;i++) {
			System.out.print("이름 입력하세요~");
			String name = scan.nextLine();
			System.out.print("나이 입력하세요~");
			String age = scan.nextLine();
			System.out.print("기타사항 입력하세요~");
			String etc = scan.nextLine();
			userInfo.put("uiName", name);
			userInfo.put("uiAge",age);
			userInfo.put("uiEtc",etc);
			if(udao.insertUserInfo(userInfo)==1) {
				System.out.println("등록 성공!");
			}else {
				System.out.println("등록 실패!");
			}
		}
	}
}
