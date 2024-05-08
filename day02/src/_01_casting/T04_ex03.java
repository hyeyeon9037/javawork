package _01_casting;

public class T04_ex03 {

	public static void main(String[] args) {
		
		/*
		 * 
	int iNum1 = 10;
    int iNum2 = 4;
    float fNum = 3.0f;
    double dNum = 2.5;
    char ch = 'K'; 

   3.1  iNum1 / iNum2의 몫 출력
   3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기.
   3.3  iNum1의 값이 10.0으로 출력되게 하기.
   3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기.
   3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오.
   3.6  iNum1 / fNum 한 결과 소수점 16자리까지 나오게 하시오.
   3.7  ch변수의 유니코드 출력하기.
   3.8  ch변수에 1을 더해 L 이 출력되게 하시오.
		 */
		
		
		
		int iNum1 = 10;
	    int iNum2 = 4;
	    System.out.println(iNum1/iNum2);
	    // 3.1 문제 맞음
	    
	    double dNum = 2.5;
	    double A = iNum2*dNum;
	    System.out.println("iNum2*dNum : " + A );
	    // 3.2 문제 틀림 ( 문제이해도 필요 "변수에 넣고 출력하기는 sysout 에 넣으라는 소리다!" )
	    
	    double a = iNum1;
	    System.out.println(a);
	    // 3.3 문제 맞음
		
	    System.out.println((double)iNum1/iNum2);
	    // 3.4 문제 맞음
	    
	    float fNum = 3.0f;
	    int fN = (int) fNum;
	    System.out.println(iNum1/fN);
	    // 3.5 문제 맞음
	    
	
	    double so = (double)iNum1/fNum;
	    System.out.println(so);
	    // 3.6 문제 맞음
	    
	    
	    char ch = 'K'; 
	    int B = ch;
	    System.out.println(B);
	    // 3.7 문제 틀림 ( 유니코드에 대한 이해도가 부족한것 같음 다시해보자 )
	    
	    char ch1 = (char)(ch+1);
	    System.out.println(ch1);
	    // 3.8 문제 맞음
	    
	    // 3.2~3.4 안보고 못풀겠음 다시해보자.
	    
	}

}
