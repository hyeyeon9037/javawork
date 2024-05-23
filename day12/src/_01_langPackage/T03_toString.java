package _01_langPackage;

class Card {
	String kind;
	int num;
	Card(){
		this("HART", 7);
	}
	Card(String kind, int num) {
		this.num = num;
		this.kind = kind;
		
	}
	/*
	//toString 오버라이딩
	@Override
	public String toString() {
		return "" + kind + ", " + num ;
	}
	*/
}

public class T03_toString {

	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("SPADE", 10);
		Card card3 = null;
		
		
		//객체를 넣은 변수를 출력하면 toStrinh()메소드가 호출된다.
		// Object클래스의 toString()은 패키지명.클래스명 @해시코드(16진수로) 출력됨.
		System.out.println(card1);
		System.out.println(card1.toString());
		
		System.out.println("----------------------------");
		
		System.out.println(card2);
		System.out.println(card2.toString());
		
		
		// 객체를 넣은 변수의 값이 null일때는 null값을 출력해준다 (toString() 호출 안함)
		System.out.println(card3);
	}

}
