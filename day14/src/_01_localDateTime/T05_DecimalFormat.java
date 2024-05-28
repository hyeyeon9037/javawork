package _01_localDateTime;

import java.text.DecimalFormat;
import java.text.ParseException;

public class T05_DecimalFormat {

	public static void main(String[] args) {
		double number = 1234567.89;
		double number2 = 0.1;
		
		//DecimalFormat df = new DecimalFormat("#, ###");
		
		// 0이면 무조건 자리차지, #이면 자리차지 없음 출력안함.
		System.out.println(new DecimalFormat("0").format(number)); // 정수로 출력
		System.out.println(new DecimalFormat("#").format(number)); 
		System.out.println(new DecimalFormat("#").format(number2)); 
		
		System.out.println(new DecimalFormat("0.0").format(number)); // 소수점 첫째자리까지 출력
		System.out.println(new DecimalFormat("#.#").format(number)); // 자리가 있으면 출력하고 자리가 없으면 출력 안해도 됨
		
		
		System.out.println(new DecimalFormat("000000000.0000").format(number)); // 없어도 무조건 출력
		System.out.println(new DecimalFormat("#########.####").format(number)); 
		
		System.out.println("-------------------------------------");
		
		System.out.println(new DecimalFormat("#,###.##").format(number));

		System.out.println("-------------------------------------");

		String stNum = "1,234,567.89";
		DecimalFormat df = new DecimalFormat("#,###.##");
		
		try {
			Number num = df.parse(stNum);
			System.out.println(num); // Number는 객체라서 연산을 할 수 없음
			
			double d = num.doubleValue(); // 실수형 변환
			System.out.println(d*2); // 변환을 했기 때문에 연산 가능
			
			System.out.println((new DecimalFormat("#,###.##").parse("354").doubleValue())*2); // 위에 내용을 한줄로 표현하면 이렇게 됨
			
		} catch (ParseException e) {
			
			e.printStackTrace();
			
		}
		
		
	}

}
