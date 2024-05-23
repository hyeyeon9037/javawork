package _02_StringMethod;

public class T01_indexOf {

	public static void main(String[] args) {
		// indexOf : 문자열이 시작되는 index 번호 반환
		// 			 찾는 문자열이 없으면 -1반환
		String str = " java program";
		int index = str.indexOf("program");
		System.out.println(index);
		
		index = str.indexOf("abc");
		System.out.println(index);
		
		if(str.indexOf("java") < 0)
			System.out.println("자바프로그램이 앙닝닝당");
		else
			System.out.println("자바프로그램 입닝당");
	}

}
