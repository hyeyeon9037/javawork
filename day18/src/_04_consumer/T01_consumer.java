package _04_consumer;

import java.util.function.*;

public class T01_consumer {

	public static void main(String[] args) {
		/*
		 * Consumer의 원형 : 미리 구현 되어 있음
		 
		 @FuctionInterface
		 public interfae Consumer<T> {
		 void accpet(T t);
		 }
		 
		 
		 */
		// Consumer interface : 리턴 값을 얻음
		// 1. 매개변수 1개 모든 객체
		Consumer<String> consumer = x -> System.out.println(x);
			consumer.accept("java");
			
		// 2. 매개변수 2개 : 앞에 bi라는 접두어를 붙인다
			BiConsumer<String, String> biCon = (a,b) -> System.out.println(a + ", " + b);
			biCon.accept("더조은", "의료용 AI");
			
		// 3. 매개변수 1개의 double형
		DoubleConsumer douCon = d -> System.out.println(d);
		douCon.accept(4.56);
		
		// 4. 매개변수 2개 중 1개는 모든객체, 1개는 int형
		ObjIntConsumer<String> oiCon = (a,b) -> System.out.println(a + ", " + b); 
		oiCon.accept("박혜연", 26);
		
		
		
		
	}

}
