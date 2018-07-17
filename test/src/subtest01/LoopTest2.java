package subtest01;

import java.util.Scanner;

public class LoopTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 \",\"를 구분자로 입력해주세요.");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		int[] nums = new int[numStrs.length];
		
		for(int i=0;i<numStrs.length;i++) {
			nums[i] = Integer.parseInt(numStrs[i]);
		}
		int min = 0;
		int max = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(i==0) {
				min = nums[i];
				max = nums[i];
			}else {
				if(min>nums[i]) {
					min = nums[i];
				}
				if(max<nums[i]) {
					max = nums[i];
				}
			}
		}
		
		System.out.printf("min=%d, max=%d", min,max);
	}
}
