package day01;

public class T01_print {

	public static void main(String[] args) {
		// 주석 : 실행하지 않음 	한줄주석 :	설명이나 기타 사항들을 적음
		/*
		 * 응애 난 박혜연 오늘 자바 처음 시작해보징
		 * 여러줄 주석 : 여러줄에 걸쳐 설명이나 특이사항들을 적을 때 사용
		 */
	
	System.out.println("더조은 컴퓨터 학원");
	System.out.println("내이름 : 박혜연");
	// 출력문 : println ▶ 출력 후 줄바꿈
	// 문자열을 출력할 때는 반드시 쌍따옴표 ("")를 넣어준다.

	System.out.println(10+16);
	System.out.println(52/2);
	System.out.println(13*2);
	
	System.out.println(5+3+"문자열 연결");
	// + 기호는 숫자일땐 연산 , 문자열일땐 문자들을 연결하는 역할
	
	System.out.println("강의실 : " + "801호");
	
	System.out.println("연산결과 : " + 7+5);
	// 앞에가 문자열이면 뒤에도 문자로 인식하기 때문에 결과 값이 "연산결과 : 75" 이 나오게 된다. [문자 연결]
	System.out.println("연산결과 : " + 7*5);
	// +와 -일 경우에만 문자로 인식하고 *와 / 는 숫자로 인식
	System.out.println("연산결과 : " + (7+5));
	// 괄호() 안에 넣게되면 문자로 인식하지 않고 숫자로 인식
	
	System.out.print("줄바꿈 안함 ");
	System.out.print("응애 나 박혜연 ");
	System.out.println("이제 바꿀랭~");
	//세개가 붙여서 나옴 → 먼저 출력하고 나중에 바뀌는거로 이해 ㄱㄱ
	
	System.out.println("배가 너무 고파서 미치겠어요.");
	System.out.println("오늘 점심메뉴는 뭘 먹을까?");
	System.out.println("샤브샤브 먹었지롱ㅋ");
	
	
	}

}
