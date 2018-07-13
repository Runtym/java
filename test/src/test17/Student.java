package test17;

public class Student {
	public String name;
	public int point;
	
	public Student(String name, int point) {
		this.name = name;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", point=" + point + "]";
	}

	public static void main(String[] args) {
		Student[] sts = new Student[3];
		sts[0] = new Student("전승현",80);
		sts[1] = new Student("강민우",60);
		sts[2] = new Student("조현경",70);
		
		for(int i=0;i<sts.length;i++) {
			for(int j=i+1;j<sts.length;j++) {
				if(sts[i].point<sts[j].point) {
					Student st = sts[i];
					sts[i] = sts[j];
					sts[j] = st;
				}
			}
		}
		for(int i=0;i<sts.length;i++) {
			System.out.println(sts[i]);
		}
		
	}
}
