package _02_repetitive;

public class _ex07 {

	public static void main(String[] args) {
		// 
		
		int count = 1;
		while(true) {
			int num = (int)(Math.random()*6) +1; // 0~6
			System.out.println( "(" + num + ")" );
			if(num == 6) {
				break;
				
			}
			count++;
		}
		System.out.println("총 주사위 굴린 횟수는 : " + count);
		
		
	}

}

/*

	      int count = 0;
	      int com =0;
	      do {
	         com =(int)(Math.random()*6) + 1;
	         count ++;
	         System.out.println("주사위 값 : "+ com);
	      }while(com != 6);
	      System.out.println("총 주사위 굴린 횟수 :" + count);
	            
*/
