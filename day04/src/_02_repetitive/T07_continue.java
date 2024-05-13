package _02_repetitive;

public class T07_continue {

	public static void main(String[] args) {
		/* continue : 실행문을 실행하지 않고 다시 반복문을 실행함
		 			: ~을 제외 할 때 많이 사용한다.
		
		ex) 1 ~ 100까지 3의배수를 제외한 합계를 구하세요 
		
		*/
		
		
		int sum = 0;
		for ( int i = 1; i<=100; i++) {
			if( i%3 == 0 ) 
				continue;
				
				sum += i;
				
			}
			System.out.println(" 1~100까지 3의 배수를 제외한 합계 : " + sum);
			
	
		
		// 같은 자료형 일때
		/*
		 int num1 = 4;
		 int num2 = 9;
		 int num3 = 5;
		 
		 int num1=4, num2 =9, num3 = 5;
		 int num1=5, num2 =5, num3 = 5;
		 */
	
		 int num4, num5, num6;
		 num4=num5=num6=5;
		 
		 //for문 사용 시 여러개의 변수 사용가능
		 for(int i=0, j=20; i<10; i++,j--) { // 조건식은 무조건 1개를 해야함 i를 조건할거면 i만, j를 조건할거면 j만
			 System.out.println(i + "," + j);
		 }
		System.out.println("----------------------------1");
		 for(int i=1, j=20, x=15, y=3; j>=10; i++, j--, x -=2, y +=5) { 
			 System.out.println(i + "," + j + "," +  x + "," + y);
			 
		 }
		 
		 
		 
		 
		 
		 
		 System.out.println("----------------------------3");
		 //while(true) 무한반복과 동일하다.
		 // = for(;;)
		 for(;;) {
			 System.out.println(num4);
			 if(num4 >= 8 )
				 break; // break 를 써야 반복문이 사라진다~
				 num4++;
		 }
		
		 System.out.println("----------------------------4");
		 
		 // 중첩 for문에서 원하는 반복문을 빠져나오고 싶을 때
		forloop : for(int dan=2; dan<=9; dan++) { // for문 앞에 이름을 명시해주면 돼 " forloop : " 이름은 맘대로 해도댐
			 for(int i=1; i<=9; i++) {
				 System.out.println(dan + "*" + i + "="	+ dan*i);
				 if (i ==5)
					break forloop; // for1oop를 빠져나와랏
		 
		/* for(int dan=2; dan<=9; dan++) {
			 for(int i=1; i<=9; i++) {
				 System.out.println(dan + "*" + i + "="	+ dan*i);
				 if (i ==5)
					break;
				 // 이렇게하면 i는 5 가 나올떄 빠져나옴 (출력문 봐봐)
				  */
				 
			 }
			 System.out.println();
		 }
		 
		 System.out.println("----------------------------5");
		 
		for(int dan=2; dan<=9; dan++) {
			mid : for(int i=1; i<=9; i++) {
				 for(int z=1; z<=5; z++) {
				 System.out.println(dan + "," + i + ","	+ z);
				 if (z == 3)
					break mid; // mid를 빠져나와라
			 }
				 System.out.println("mid for문 종료"); // 출력안댐 mid를 빠져나왔기때문 "mid에 있는 for문을 다빠지는거임"
		}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
	
	
	}