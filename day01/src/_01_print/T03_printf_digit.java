package _01_print;

public class T03_printf_digit {

	public static void main(String[] args) {
	
		System.out.printf("%7d\n", 32000);
		System.out.printf("%7d\n", 320000);
		System.out.printf("%7d\n",3200);
		
		// %7d 앞에 숫자가 붙이면 7자리를 채워야된다 소리 ( 따라서 띄어쓰기로 되어있음 )
		
		System.out.println("-------------------");
		
		System.out.printf("%07d\n", 32000);
		System.out.printf("%07d\n", 320000);
		System.out.printf("%07d\n",3200);
		
		// // %07d 숫자앞에 0 이있다면 빈자리는 0으로 채운다는 꼬얌~
		
		System.out.printf("[%10s]","abcdefg");
		System.out.printf("[%-10s]\n", "abcdefg");
		
		// -는 반대로 띄어쓰기가 됨
		
		System.out.println("-------------------");
		
		System.out.printf("%6.2f\n", 13.456);
		// 6.2 <- 소수점 6자리까지 그 중에서 소수점은 2째자리 수만. (끝에는 자동으로 반올림)
		
		System.out.printf("%.3f", 265.548873);
		// ★중요★ .3 소수점은 3째자리 수만. (끝에는 자동으로 반올림)
		
		System.out.format("%.3f", 265.548873);
		// prinf랑 똑같음
	}

}
