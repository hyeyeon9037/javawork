package _02_variable;

public class T02_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char ch1 = 'h';
	char ch2 = '박';
	char ch3 = '♡';
	
	System.out.println(ch1);
	System.out.println(ch2);
	System.out.println(ch3);
	
	char ch4 = 'A' + 1;
	// 아스키코드 A = 64
	System.out.println(ch4);
	
	char ch5 = 'C';
	//char ch6 = ch5 + 1; 는 오류가 남.(자동형변환 때문) ▶ "연산이 일어났을때" int형으로 바뀜
	
	char ch7 = 'A' + '1';
	System.out.println(ch7);
	// A의 유니코드 (65) + 1의 유니코드(49) = 114 → 114의 유니코드는 r ∴ 값은 r로 나옴
	
	
	
	
	
	
	}

}
