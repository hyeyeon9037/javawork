package _05_polymorphism;

class Car {
	String color;

	
	void drive () {
		System.out.println("운전중 빵빵!");
	}
	
	void stop() {
		System.out.println(" 멈추ㅓㅓ!! ");
	}
}
	
	class FireCar extends Car{
	void water() {
		System.out.println("물을 뿌립니당~");
		
	}
	
}

public class T03_polyRun {

	public static void main(String[] args) {
		
		FireCar fCar = new FireCar();
		fCar.drive();
		fCar.water();
		fCar.stop();
		
		Car car = fCar;
		car.drive();
		car.stop();
		// car.water(); 사용불가능
		
		FireCar fCar2 = (FireCar)car; // 부모타입 → 자식타입으로 강제형변환
		/*
		 * 주의
		 * 반드시 부모는 최초객체생성시 자식의 타입으로 객체 생성되어 있어야한다.
		 */
		
		Car car2 = new Car();
		// FireCar fCar3 = (FireCar)car2; 형변환이 불가능 : 컴파일 오류(실행시 오류)
	
		FireCar fCar3 = null;
		//instanceof : 좌측의 객체가 우측의 타입으로 만들어졌느냐 검사하는 것 (만들어졌음 true)
		if(fCar3 instanceof FireCar	) {
			fCar3 = (FireCar)car2;
		}else
			System.out.println("변환할수 없음");
		
	}

}
