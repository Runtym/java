package test20;

public class Exec {
	
	public static void start(Drive[] ds) {
		for(Drive d : ds) {
			d.start();
		}
	}
	
	public static void attack(Drive[] ds) {
		for(Drive d : ds) {
			System.out.println(d.attack(30));
		}
	}
	
	public static void stop(Drive[] ds) {
		for(Drive d : ds) {
			d.stop();
		}
		
	}
	public static void main(String[] args) {
		Drive[] d = new Drive[3];
		d[0] = new Lulu("루루", 100,50);
		d[1] = new Solid("솔리드",80,50);
		d[2] = new TraningCart("연습카드",50,40);
		start(d);
		attack(d);
		stop(d);
	}
}
