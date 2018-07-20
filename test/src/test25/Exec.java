package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.impl.UserDAOImpl;

public class Exec {
// delete from  user_info where uiNum=3
	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		HashMap<String,String> userInfo = new HashMap<String,String>();
		userInfo.put("uiName","홍길동");
		userInfo.put("uiNum","12");
		if(udao.deleteUserInfo(userInfo)==1) {
			System.out.println("삭제 완료!");
		}else {
			System.out.println("삭제 실패!");
		}
		ArrayList<HashMap<String, String>> userList = 
				udao.selectUserInfoList(userInfo);
		System.out.println(userList);
		for(HashMap<String, String> user : userList) {
			System.out.println(user);
		}
		
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
