package _01_casting;

public class T01_promotion {

	public static void main(String[] args) {
		//자동형변환 수업
		
		byte b1 = 20;
		short s1 = b1;
		// short는 자동으로 형변환
		
		int int1 = b1;
		int1 = s1;
		
		char ch1 = '김';
		int inch = ch1;
		System.out.println("'A'의 유니코드 : " + inch); // ★ sysout + ctrl + space 단축키
		System.out.println(ch1);
		
		double d1 = int1;
		System.out.println(d1);
		d1 = s1+1;
		System.out.println(d1);
		d1 = b1+2;
		System.out.println(d1);
		
		
		
		
		
		
		
		
		

	}

}
