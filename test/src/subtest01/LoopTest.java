package subtest01;
import java.util.Scanner;

public class LoopTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("시작값을 입력해주세요~");
		int min = Integer.parseInt(s.nextLine());
		System.out.println("종료값을 입력해주세요~");
		int max = Integer.parseInt(s.nextLine());
		
		if(max<min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		for(int i=min;i<=max;i++) {
			System.out.println(i);
		}
	}
}
