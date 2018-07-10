package test07;

public class MultiLoop {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			System.out.println();
			for(int j=1;j<10;j++) {
				System.out.print(j + " X " + i + " = " + (i*j) + ", ");
			}
		}
	}
}