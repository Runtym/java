package test12;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 1부터 5까지 중 1개를 입력해주세요");
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr);
		if(num==1) {
			System.out.println("당신은 나서는걸 좋아하는 타입이군요!");
		}else if(num==2) {
			System.out.println("당신은 뒤에서 조종하는걸 좋아하는 타입이군요!");
		}else if(num==3) {
			System.out.println("당신은 센터에 욕심이 있꾼요.");
		}else if(num==4) {
			System.out.println("어중간한 타입이네요");
		}else if(num==5) {
			System.out.println("욕심이 없는 타입이군요.");
		}else {
			System.out.println("한글 몰라? 1부터 5까지만 입력하라고!");
		}
		System.out.println("니가 입력한 숫자 : " + numStr);
	}
}
