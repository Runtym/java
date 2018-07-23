package test26;

import java.util.ArrayList;

public class ListTest {
	private String[] strArr;

	
	public ListTest() {
		this.strArr = new String[0];
	}
	
	public boolean add(String str) {
		String[] tmpArr = this.strArr;
		this.strArr = new String[this.strArr.length+1];
		for(int i=0;i<tmpArr.length;i++) {
			this.strArr[i] = tmpArr[i];
		}
		this.strArr[this.strArr.length-1] = str;
		return true;
	}
	public int size() {
		return this.strArr.length;
	}
	public String toString() {
		String str = "[";
		for(String s:this.strArr) {
			str += s+",";
		}
		str = str.substring(0,str.length()-1);
		str += "]";
		return str;
	}
	public String get(int idx) {
		if(this.strArr.length<=idx) {
			System.out.println(idx + "번 방같은건 없어요");
		}
		return this.strArr[idx];
	}
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		System.out.println(lt.size());
		lt.add("1");
		lt.add("2");
		lt.add("3");
		for(int i=0;i<lt.size();i++) {
			System.out.println(lt.get(i));
		}
	}
}
