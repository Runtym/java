package test22;

public class MinMax {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 2;
		arr[2] = 8;
		arr[3] = 30;
		arr[4] = 20;
		int min = 0;
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				min = arr[0];
				max = arr[0];
			}else {
				if(min>arr[i]) {
					min = arr[i];
				}
				if(max<arr[i]) {
					max = arr[i];
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
		for(int i=min;i<=max;i++) {
			System.out.println(i);
		}
		
	}
}
