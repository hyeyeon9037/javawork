package _02_StringMethod;

public class T05_contanis {

	public static void main(String[] args) {
		// contains : 문자열 안에 찾고자하는 문자열이 포함이 되어 있는지 검사하는 것
		String str = "HTML 웹 프로그래밍";
		
		boolean result = str.contains("java");
		System.out.println(result);
		
		
		if ( str.contains("HTML"))
			System.out.println("웹페이지를 만드는 프로그램");
		else
			System.out.println("기타 프로그램");
		

	}

}
