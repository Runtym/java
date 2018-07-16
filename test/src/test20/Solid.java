package test20;

public class Solid extends Cart{

	public Solid(String name, int speed, int damaege) {
		super(name, speed, damaege);
	}

	public String attack(int dameage) {
		return this.damaege + dameage + "만큼 공격합니다.";
	}
}
