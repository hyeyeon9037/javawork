package _01_object;

public class _T01_main_Class {

	public static void main(String[] args) {
		// 속성 == 필드 == 변수,상수
		
		
		T01_api_Class ob1 = new T01_api_Class(); // T01_api_Class에 있는 속성들을 변수로 델꼬온거
		int result = ob1.num ; // T01_api_Class 에있는 num 값을 가져옴
		System.out.println(result); // ob1.num 과 같음
		System.out.println(ob1.num);
		System.out.println(ob1.name); 
		
		ob1.name = "김지원"; // 김지원을 name에다가 덮어씌우라는 소리
		System.out.println(ob1.name); // 출력값이 김지원으로 뜸
		
		
	}

}
