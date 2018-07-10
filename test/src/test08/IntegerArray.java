package test08;

public class IntegerArray {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for(int i=0;i<=5;i++) {
			arr[i] = (int)(Math.random()*45)+1;
			System.out.println(arr[i]);
		}
	}
}
