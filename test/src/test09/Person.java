package test09;


public class Person {
	private String name;
	private int age;
	private String address;
	int speed;
	Person(int speed){
		this.speed = speed;
	}
	public void run() {
		System.out.println(speed + "속도로 뜁니다.");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
}
