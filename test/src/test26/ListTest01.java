package test26;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	public static void main(String[] args) {
		List<Number> al = new ArrayList<Number>();
		al.add(10);
		al.add(10.1);
		Number n = al.get(0);
		al.set(0,20);
		n = al.get(0);
		System.out.println(n);		
	}
}
