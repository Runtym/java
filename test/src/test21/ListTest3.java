package test21;

import java.util.ArrayList;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		for(int i=1;i<=5;i++) {
			String name = "테스트" + i;
			int grade = (int)(Math.random() * 3) + 1;
			sList.add(new Student(name,grade));
		}
		
		for(Student st:sList) {
			System.out.println(st.name + "," + st.grade);
		}
	}
}
