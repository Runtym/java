package test13;

import java.util.Scanner;

public class SortTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 ,로 구분하여 입력해주세요");
		String str = scan.nextLine();
		scan.close();
		
		String[] arrStr = str.split(",");
		int[] arrNum = new int[arrStr.length];
		for(int i=0;i<arrNum.length;i++) {
			arrNum[i] = Integer.parseInt(arrStr[i]);
		}
		for(int i=0;i<arrNum.length;i++) {
			for(int j=i+1;j<arrNum.length;j++) {
				if(arrNum[i]<arrNum[j]) {
					int tmp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = tmp;
				}
			}
		}
		for(int i=0;i<arrNum.length;i++) {
			System.out.println("arrNum[" + i + "] : " + arrNum[i]);
		}
	}
}
