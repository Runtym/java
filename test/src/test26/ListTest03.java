package test26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * Animal이란는 클래스를 생성해주세요.
 * name이라는 String 변수를 선언해주세요.
 * Dog와 Cat이라는 클래스를 생성하여 Animal이는
 * 클래스를 상속받아주세요.
 * Animal만 가질수 있는 aniList를 생성하여
 * 2마리의 개와 2마리의 고양이를
 * aniList에 저장하고
 * 출력하는 코드를 작성해주세요.
 */
public class ListTest03 {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();
		Scanner s =new Scanner(System.in);	
		for(int i=0;i<5;i++) {
			System.out.println("이름을 입력해주세요");
			String name = s.nextLine();
			System.out.println("나이을 입력해주세요");
			int age = Integer.parseInt(s.nextLine());
			pList.add(new Person(name,age));
		}
		
		for(Person p:pList) {
			System.out.println(p);
		}
	}
}
