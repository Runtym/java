package test18;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Person[] ps = new Person[5];
		int[] points = new int[ps.length];
		for(int i=0;i<ps.length;i++) {
			ps[i] = new Person();
			ps[i].name = (i+1)+"번째 사람";
			System.out.println(i+1+"번째 사람의 점수를 입력해주세요");
			ps[i].point = Integer.parseInt(scan.nextLine());
			points[i] = ps[i].point;
		}
		
		for(int i=0;i<points.length;i++) {
			for(int j=i+1;j<points.length;j++) {
				if(points[i]<points[j]) {
					int tmp = points[i];
					points[i] = points[j];
					points[j] = tmp;
				}
			}
		}

		for(int i=0;i<points.length;i++) {
			for(int j=0;j<ps.length;j++) {
				if(points[i]==ps[j].point) {
					ps[j].rank = i+1;
				}
			}
		}
		
		for(int i=0;i<ps.length;i++) {
			System.out.println(ps[i].name + "님의 점수는 " + ps[i].point + "입니다.");
			System.out.println(ps[i].name + "님의 등수는 " + ps[i].rank + "등 입니다.");
		}
	}
}
