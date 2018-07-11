package test12;

import java.util.Scanner;

public class ArrayTest {
	
	public static boolean isDuple(int[] numArr,int num) {
		for(int i=0;i<numArr.length;i++) {
			if(numArr[i]==num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numArr = new int[5];
		for(int i=0;i<numArr.length;i++) {
			System.out.println("숫자를 1부터 5까지 중 1개를 입력해주세요");
			String numStr = scan.nextLine();
			int num = Integer.parseInt(numStr);
			if(isDuple(numArr,num)) {
				i--;
				System.out.println("중복숫자 입력하지 말라고!!");
				continue;
			}
			numArr[i] = num;
		}
		scan.close();
	}
}
