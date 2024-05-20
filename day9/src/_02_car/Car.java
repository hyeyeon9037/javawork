package _02_car;

public class Car {

	String model;
	String company;
	int speed;
	
	Car ( String model, String company){
		this.model = model;
		this.company = company;
	}
	
	// power boolean 써서 한번 해보기
	void powerUp() {
		System.out.println("시동을 킴");
	}
	
	void powerOut() {
		System.out.println("시동을 끔");
	}
	
	void speedUp() {
		speed += 100;
		System.out.println("속도올림" +" 현재속도 "+ speed);
	
	}
	
	
	void speedDown() {
		speed -= 100;
		System.out.println("속도내림" +" 현재속도 "+ speed);
	}
	
}
