package test10;

public class Calc {
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void minus(int a, int b) {
		System.out.println(a - b);
	}
	public void multiple(int a, int b) {
		System.out.println(a * b);
	}
	public void divide(int a, int b) {
		System.out.println(a / b);
	}
	public void calc(String op, int num1, int num2) {
		if(op.equals("+")) {
			add(num1,num2);
		}
	}
}
