package test23;

public class Controller {
	
	public void callOrder(String order) {
		if("1".equals(order)) {
			System.out.println("유저리스트를 보고 싶군요.");
		}else if("2".equals(order)) {
			System.out.println("유저를 추가하고 싶군요.");
		}else if("q".equals(order)) {
			System.out.println("종료하고 싶군요");
			System.exit(0);
		}else {
			System.out.println("존재하지 않는 명령어입니다.");
		}
	}
}
