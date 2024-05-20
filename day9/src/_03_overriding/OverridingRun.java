package _03_overriding;

class Over {
	void show (String str) {
		System.out.println("부모 클래스 메소드 : " + str);
		
	}
}

//리턴자료형 show , 자료형 string 
class OverChild extends Over {
	void show (String abd) {
		System.out.println("자식 클래스 메소드 : " + abd); // 자료형 같음 오버라이딩
	}
}

public class OverridingRun {
	
	public static void main(String[] args) {
		OverChild oChild = new OverChild();
		
		oChild.show("자바 프로그래밍");
		
		Over over = new Over();
		over.show("오라클");
	}
	
	
}
