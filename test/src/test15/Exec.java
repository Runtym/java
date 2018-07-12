package test15;

public class Exec {

	public static void main(String[] args) {
		Person p = new KilDong();
		LuckyNum ln = new LuckyNum();
		ln.checkLuckyGuy(p);
		Person p2 = new RionPark();
		ln.checkLuckyGuy(p2);
	}
}
