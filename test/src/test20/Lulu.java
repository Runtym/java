package test20;

public class Lulu extends Cart {

	public Lulu(String name, int speed, int damaege) {
		super(name, speed, damaege);
	}

	public void stop() {
		System.out.println(name + "이 멋있게 정지!!");
	}

}
