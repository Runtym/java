package test15;

public class LuckyNum {
	private int luckyNum;
	
	LuckyNum(){
		luckyNum = ((int)Math.random()*10)+1;
	}
	
	public void checkLuckyGuy(Person p) {
		if(p instanceof KilDong) {
			KilDong kd = (KilDong)p;
			kd.checkMyLuckyNum(luckyNum);
		}else if(p instanceof RionPark) {
			RionPark rp = (RionPark)p;
			rp.test();
		}
		
	}
}
