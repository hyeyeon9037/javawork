package _02_referenceType;

public class T01_StringClass {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String hobby = "공부하기";
		
		System.out.println("주소가 같은가? " + name == hobby	);
		
		String strl = "의료용";
		String strl2 = "의료용";
		
		System.out.println("주소가 같은가? "+ (strl == strl2));
		
		String myName = "홍길동";
		System.out.println("주소가 같은가? "+ (name == myName));
		
		
		String str3 = new String("영상");
		String str4 = new String("영상");
		System.out.println("주소가 같은가? "+(str3 == str4));
		// 다른 이유 객체 생성을 따로 따로 했기때문에 다름 (new)
		
		System.out.println("값이 같은가? " + str3.equals(str4));
		// equals 주소가 다른 것을 비교할수 있는 메소드 (값을 비교하는 것), String을 할때에 equals를 많이씀
		

	}

}
