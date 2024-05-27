package _01_StringBuffer_Builder;

public class T03_Math {

	public static void main(String[] args) {

		System.out.println("-11의 절댓값 : " + Math.abs(-11));
		System.out.println("-11.45의 절댓값 : " + Math.abs(-11.45));
		
		
		//소수점 이하 무조건 올림
		System.out.println("13.1의 올림 : " + Math.ceil(13.1));
		System.out.println("13.1의 올림 : " + Math.ceil(-13.1));
		
		
		
		//소수점 이하 무조건 내림
		System.out.println("13.7의 내림 : " + Math.floor(13.7));
		System.out.println("13.7의 내림 : " + Math.floor(-13.7));
		
		
		
		//가장 가까운 정수값 반환
		System.out.println("13.1의 가까운 정수값 : " + Math.rint(13.1));
		System.out.println("13.7의 가까운 정수값 : " + Math.rint(13.7));
		System.out.println("-13.7의 가까운 정수값 : " + Math.rint(-13.7));
		
		
		//소수점 이하 반올림
		System.out.println("13.7의 반올림 : " + Math.round(13.7));
		System.out.println("-13.7의 반올림 : " + Math.round(-13.7)); // -일때에는 rint -13.7과 똑같음 ( round 는 가까운걸로 반올림 함 )
		
	
		
		// 두 수중 큰수 반환
		System.out.println("7과 8중 큰 숫자 : " + Math.max(7, 8));
		System.out.println("7과 8중 작은 숫자 : " + Math.min(7, 8));
		
		
		//소수점 2째 자리까지 얻기
		double value = 12.34567;
		double value2 = value*100;
		System.out.println(value2);
		Math.round(value2);
		
		//long re = Math.round(value2); Math.round()의 반환형은 long형
		int result = (int)Math.round(value2);
		System.out.println(result);
		System.out.println(result/100.0);
		
		
		double re = Math.round(value2);
		System.out.println(re/100);
		
		
		System.out.println("-----------------------------------------");
	
		// 제곱연산
		System.out.println(Math.pow(5, 3)); // 5의 3승 
		System.out.println(Math.pow(1024, 2)); 
		
		// 제곱근
		System.out.println(Math.sqrt(25)); // ★루트 √25 = 5
		
		//random
		double ran = Math.random()*100; // 0 ~ 99.xx
		double ran2 = Math.round(ran);
		System.out.println(ran2/100);
		
		double ran11 = (int)Math.random()*100+1; // 0 ~ 100
		System.out.println(ran11);
		
		
		double ran12 = (Math.random()*100)+1; // 1 ~ 100.xxxxxx
		double ran13 = ran12*100;
		double ran14 = Math.round(ran13);
		System.out.println(ran14/100);
		
		System.out.printf("%.2f", (Math.random()*100 + 1));
		
	}

}
