package test26;

import java.util.ArrayList;
import java.util.List;

public class ListTest04 {

	public static void main(String[] args) {
		List<Animal> aniList = new ArrayList<Animal>();
		Dog d1 = new Dog();
		d1.setName("닥스훈트");
		Dog d2 = new Dog();
		d2.setName("요쿠셔");
		Cat c1 = new Cat();
		c1.setName("샴");
		Cat c2 = new Cat();
		c2.setName("코숏");
		aniList.add(d1);
		aniList.add(d2);
		aniList.add(c1);
		aniList.add(c2);
		
		for(Animal a : aniList) {
			System.out.println(a);
		}
	}
}
