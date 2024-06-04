package _05_supplier;

import java.util.function.*;

public class T01_supplier {

	public static void main(String[] args) {
		// Supplier 매개변수가 없고, 리턴 값이 있는 인터페이스
		
		
		// Supplier<> sup = () -> {return "aaaa"; }; 
		// 생략한다면? 
		Supplier<String> sup = () -> "aaaa";

		// 출력 방법 1)
		String str = sup.get();
		
		// 출력 방법 2)
		System.out.println(sup.get());
		
		
		IntSupplier isup = () -> 5;
		
		IntSupplier isup2 = () -> (int)(Math.random() * 45) +1;
		
		System.out.println(isup2.getAsInt());
		
		
		BooleanSupplier bsup = () -> 5 < 6;
		System.out.println(bsup.getAsBoolean());
		
		
		
		
		
		
	}

}
