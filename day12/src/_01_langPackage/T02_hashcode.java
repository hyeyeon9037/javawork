package _01_langPackage;

public class T02_hashcode {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//String 클래스는 equals, hashCode 를 오버라이딩을 해놓은 상태
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());// 주소가
		System.out.println(str2.hashCode());// 다르다
		
		// 원래 객체의 해시코드(고유)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	
	
	
	
	}

}
