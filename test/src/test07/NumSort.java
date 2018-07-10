package test07;

public class NumSort {
	public static void main(String[] args) {
		int[] arrNum = new int[3];
		arrNum[0] = 30;
		arrNum[1] = 20;
		arrNum[2] = 10;
		
		for(int i=0;i<arrNum.length;i++) {
			for(int j=i+1;j<arrNum.length;j++) {
				if(arrNum[i]>arrNum[j]) {
					int tmp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = tmp;
				}
			}
		}
		for(int i=0;i<arrNum.length;i++) {
			System.out.println(arrNum[i]);
		}
	}
}
