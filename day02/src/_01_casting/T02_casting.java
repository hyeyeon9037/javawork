package _01_casting;

public class T02_casting {

	public static void main(String[] args) {
		// 강제 형변환 수업
		
		
		System.out.println("byte 크기 : "+ Byte.MIN_VALUE+ " ~ " + Byte.MAX_VALUE); 
		System.out.println("short 크기 : "+ Short.MIN_VALUE + " ~ "+ Short.MAX_VALUE);
		System.out.println("int 크기 : "+ Integer.MIN_VALUE + " ~ "+ Integer.MAX_VALUE);
		System.out.println("char 크기 : "+ (int)Character.MIN_VALUE + " ~ "+ (int)Character.MAX_VALUE ); // char은 문자이기때문에 강제로 int로 바꿔야함.
		System.out.println("char 크기 : "+ Character.MIN_VALUE + " ~ "+ Character.MAX_VALUE ); // 구냥 강제로 int로 안바꾸고 해보는것
		System.out.println("--------------------------------------------");
		
		
		int num1 = 123456;
		// byte b1 = num1; ← 4byte를 1byte로 넣은거라서 오류가 뜸
		
		byte b1 = (byte)num1;
		System.out.println(b1);
		// 여기서 나오는 결과값은 64임 → why? 1바이트로 강제로 해서 결과 값이 123456으로 나오지 않는다.
		
		long long1 = 111111111345L;
		float float1 = long1;
		System.out.println(float1);
		
		int num2 = 50896;
		char ch1 = (char)num2;
		System.out.println(ch1); 
		
		
	}

}
