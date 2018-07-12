package test16;

import java.util.Scanner;

public class ListTest {
	public String[] arrStr;
	private int idx = 0;
	ListTest(){
		arrStr = new String[0];
	}
	private void copy() {
		String[] tmpStr = this.arrStr;
		this.arrStr = new String[this.arrStr.length+1];
		int i=0;
		for(String tmp : tmpStr) {
			this.arrStr[i++] = tmp;
		}
	}
	public boolean add(String str) {
		copy();
		this.arrStr[idx] = str;
		idx++;
		return true;
	}
	public int indexOf(String str) {
		for(int i=0;i<this.arrStr.length;i++) {
			if(this.arrStr[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}
	public boolean remove(int idx) {
		this.arrStr[idx] = null;
		return true;
	}
	public int size() {
		return this.arrStr.length;
	}
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		System.out.println(lt.size());
		lt.add("abc");
		lt.add("abc");
		lt.add("abc");
		lt.add("abc");
		System.out.println(lt.size());
	}
}
