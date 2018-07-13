package test18;

public class Rabbit {
	public String rabbitName;
	public int rank;
	
	Rabbit(String rabbitName, int rank){
		this.rabbitName = rabbitName;
		this.rank = rank;
	}
	
	
	@Override
	public String toString() {
		return "Rabbit [rabbitName=" + rabbitName + ", rank=" + rank + "]";
	}


	static void initRabbitArr(Rabbit[] r) {
		for(int i=0;i<r.length;i++) {
			int rank = (int)(Math.random()*10) + 1;
			r[i] = new Rabbit(i+"번째 토끼", rank);
		}
	}
	static void ascRabbitArr(Rabbit[] r) {
		for(int i=0;i<r.length;i++) {
			for(int j=i+1;j<r.length;j++) {
				if(r[i].rank<r[j].rank) {
					Rabbit tmp = r[i];
					r[i] = r[j];
					r[j] = tmp;
				}
			}
		}
	}
	static void descRabbitArr(Rabbit[] r) {
		for(int i=0;i<r.length;i++) {
			for(int j=i+1;j<r.length;j++) {
				if(r[i].rank>r[j].rank) {
					Rabbit tmp = r[i];
					r[i] = r[j];
					r[j] = tmp;
				}
			}
		}
	}
	static void printArr(Rabbit[] r) {
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i]);
		}
	}
	public static void main(String[] args) {
		Rabbit[] r = new Rabbit[10];
		initRabbitArr(r);
		ascRabbitArr(r);
		printArr(r);
		descRabbitArr(r);
		printArr(r);
	}
}
