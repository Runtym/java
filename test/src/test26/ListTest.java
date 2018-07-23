package test26;

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
	public int indexOf(String str) {
		for(int i=0;i<this.strArr.length;i++) {
			if(str.equals(this.strArr[i])) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.add("abc");
		lt.add("tt");
		lt.add("cc");
		System.out.println(lt);
		System.out.println(lt.indexOf("cc"));
		System.out.println(lt.indexOf("cc1"));
		
	}
}
