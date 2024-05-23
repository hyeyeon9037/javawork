package _02_StringMethod;

public class T02_replace {

	public static void main(String[] args) {
		// replace : 글자 치환
		String str = "javaprogram java awsjava dejava";
		String newStr = str.replace("j", "java"); // j라는 글자를 java로 치환하세요! 라는뜻
		newStr = str.replace("j", "자바");
				
		
		System.out.println(str);
		System.out.println(newStr);
		
		System.out.println("-------------------");
		
		str = "javaprogram jeava awsjava dajva";
		
		newStr = str.replace("java", "자바"); // java 에 중간에 jeave 거나 jva 인것들은 보지 치환하지못함.
		System.out.println(newStr);
		
	
		newStr = str.replaceAll("a", "A");
		System.out.println(newStr);
		
		// replaceFirst
		newStr = str.replaceFirst("java", "자바");
		System.out.println(newStr);

	}

}
