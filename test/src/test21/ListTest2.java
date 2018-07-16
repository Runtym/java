package test21;

import java.util.ArrayList;
import java.util.HashMap;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<6;i++) {
			int rNum = (int)(Math.random()*45)+1;
			al.add(rNum);
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(al.get(i));
		}
		
		
	}
}
