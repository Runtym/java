package test14;

public class Desktop extends Computer{


	public String display;

	@Override
	public String toString() {
		return "Desktop [display=" + display + ", cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd + "]";
	}
	
}
