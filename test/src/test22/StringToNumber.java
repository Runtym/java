package test22;

import java.util.Scanner;

public class StringToNumber {
	static Scanner scan = new Scanner(System.in);
	static int num = 0;
	public static boolean parseInt() {
		try {
			System.out.println("숫자를 입력해주세요");
			num = Integer.parseInt(scan.nextLine());
			return false;
		}catch(Exception nfe) {
			nfe.printStackTrace();
			System.out.println("입력하라는 숫자는 안입력하고!!");
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("숫자 변환 프로그램을 시작합니다.");
		boolean isOk = true;
		while(isOk) {
			isOk = parseInt();
		}
		System.out.println("니가 입력한 숫자는 " + num + "이구나");
		System.out.println("프로그램이 정상종료 되었습니다!");
	}
}
