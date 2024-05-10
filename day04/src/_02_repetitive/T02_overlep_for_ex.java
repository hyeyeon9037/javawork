package _02_repetitive;

public class T02_overlep_for_ex {

	public static void main(String[] args) {
		// 구구단
				/*
				 
				 2단  	 	 3단
				 2*1 = 2	 3*1 = 3
				 2*2 = 4   	 3*2 = 6
				 ...	  	 ...
				 2*9 = 18	 3*9 = 27
				 
				 이렇게 9 단까지 만들어보자.
				 
				 */
				System.out.println("2단\t \t3단 \t \t4단 \t \t5단 \t \t6단\t \t7단\t \t8단 \t \t9단");
				for(int i=1; i<=9; i++) {
					for(int j=2; j<=9; j++) {
						System.out.print( j + "*" + i + "=" + i*j + "\t" +  "\t" );
					}
					
					System.out.println();
				}
				

	}

}
//존나어려워시치...