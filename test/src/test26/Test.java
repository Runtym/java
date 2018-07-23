package test26;

public class Test {
	public static void main(String[] args) {
		String[] strs = {"1","2","3"};
		String[] tmps = strs;
		strs = new String[strs.length-1];
		int idx = 1;
		for(int i=0;i<idx;i++) {
			strs[i] = tmps[i];
		}
		for(int i=idx+1;i<tmps.length;i++) {
			strs[i-1] = tmps[i];
		}
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
}
