package test17;

public class ThreeSixNine {
	private int a;
	public ThreeSixNine() {
		this(10);
	}
	public ThreeSixNine(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		int ranNum = 100;
		int cnt = 0;
		for(int i=1;i<=ranNum;i++) {
			int m = i/10;
			int n = i%10;
			if(m!=0 && m%3==0) {
				cnt++;
				System.out.print(i);
			}
			if(n!=0 &&n%3==0) {
				cnt++;
				System.out.print("," + i);
			}
			System.out.println();
		}
		System.out.println("짝 갯수 " + cnt);
	}
}
