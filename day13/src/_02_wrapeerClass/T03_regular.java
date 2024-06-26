package _02_wrapeerClass;

import java.util.regex.Pattern;

public class T03_regular {

	public static void main(String[] args) {
		 String regExp = "( 02|010)-\\d{3,4}-\\d{4}"; // [0-9]\d 0~9 사이 숫자중 아무거나
		 String data = "010-234-6789";
		 
		 boolean result = Pattern.matches(regExp, data);
		 if(result)
			 System.out.println("정규식과 일치합니다");
		 else
			 System.out.println("정규식과 일치하지 않습니다.");
		 //      ^는 ~부터 시작하는 
		 //이메일 체크  a~z,A~z+ 0~9   \\w 숫자 아니면 문자 중에서 한글자 이상이라는 뜻  , (\\.\\w+)도 같은 뜻
		 regExp = "^[a-zA-Z]+[0-9]+@\\w+.\\w+(\\.\\w+)";
		 data ="angle@naver.co.kr";
		 result = Pattern.matches(regExp, data);
		 if(result)
			 System.out.println("정규식과 일치합니다");
		 else
			 System.out.println("정규식과 일치하지 않습니다.");
		 
		 
	}

}
