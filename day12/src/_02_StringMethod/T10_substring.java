package _02_StringMethod;

public class T10_substring {

	public static void main(String[] args) {
		String str = "spring aws start"; 
		//substring(index) : 문자열 index번호부터 끝까지 얻어옴
		System.out.println(str.substring(7)); // index 7번부터 끝까지 출력한다는 뜻
		
		// substring(index, lastindex) : 문자열에서 index번호부터 lastIndex(포함안함) 이전까지 얻어옴
		System.out.println(str.substring(7, 10)); //index 7~9까지 출력 내가 뽑고싶은 마지막 인덱스 글자보다 하나 큰 숫자를 써줘야함
		
	}

}
