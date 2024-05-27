package _01_StringBuffer_Builder;

public class T01_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2)" + sb1.equals(sb2));
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println("sb == sb2 ? " + (s1 == s2));
		System.out.println("sb1.equals(sb2)" + s1.equals(s2));
		
		System.out.println("sb1=" + sb1);
		
		//toString() 오버라이딩 되어있음 (문자열 반환)
		System.out.println("sb1= " + sb1);
		sb1.append("def");
		System.out.println("sb1=" + sb1);
	
		System.out.println("---------------------------------1");
		
		sb1.append("123");
		System.out.println("sb1=" + sb1);
	
		System.out.println("---------------------------------2");
		
		sb1.append("true");
		System.out.println("sb1=" + sb1);
		
		System.out.println("---------------------------------3");
		
		
		sb1.deleteCharAt(8);
		System.out.println("sb1=" + sb1);
		sb1.delete(6, 12);
		System.out.println("sb1=" + sb1);
		
		System.out.println("---------------------------------4");
		
		// insert(얼만큼 떨어뜨려서, 문자열)
		sb1.insert(1, "java");
		System.out.println("sb1=" + sb1);
	
		
		System.out.println("---------------------------------5");
		sb1.replace(5, sb1.length(), " spring");
		System.out.println("sb1=" + sb1);
		System.out.println( "sb1.reverse = " + sb1.reverse() );
		
		
		System.out.println("---------------------------------6");
		
		// capacity() : StringBuffer의 객체가 생성될 때 기본 버퍼의 크기는 16byte + 문자 크기
		StringBuffer sb5 = new StringBuffer();
		StringBuffer sb6 = new StringBuffer("a");
		System.out.println("sb5의 버퍼 크기 : " + sb5.capacity() );
		System.out.println("sb6의 버퍼 크기 : " + sb6.capacity() );
		
		
		// 버퍼의 크기를 지정 가능
		StringBuffer sb7 = new StringBuffer(32);
		System.out.println("sb7의 버퍼 크기 : " + sb7.capacity() );
		
		
	}

}
