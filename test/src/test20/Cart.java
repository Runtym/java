package test20;

public class Cart implements Drive {
	protected String name;
	protected int speed;
	protected int damaege;
	
	public Cart(String name, int speed, int damaege) {
		this.name = name;
		this.speed = speed;
		this.damaege = damaege;
	}
	
	@Override
	public String attack(int damaege) {
		return damaege + "로 공격합니다.";
	}

	@Override
	public void start() {
		System.out.println(speed + "로 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("정지합니다.");
	}

}
