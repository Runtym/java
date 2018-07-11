package test14;

public class Tablet extends Computer{

	public String display;

	@Override
	public String toString() {
		return "Tablet [display=" + display + ", cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd + "]";
	}
	
}
