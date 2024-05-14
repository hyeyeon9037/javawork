package _04_car;

public class T01_main_car {

	public static void main(String[] args) {

		T01_api_car car1 = new T01_api_car();
		
		System.out.println(" 회사 명 : " + car1.company);
		System.out.println( " 모델 명 : " + car1.property);
		
		car1.color = "블루";
		System.out.println( " 컬러 : " + car1.color );
		
		car1.start();
		
		System.out.println("스피드 10씩 올리기 : " + car1.speedUp());
		System.out.println("스피드 10씩 올리기 : " + car1.speedUp());
		System.out.println("스피드 10씩 내리기 : " + car1.speedDown());
		System.out.println("스피드 10씩 내리기 : " + car1.speedDown());
		
		car1.start();
		
	}

}
