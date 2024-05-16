package _01_obj;

public class T01_main_car {

	public static void main(String[] args) {
	
		//객체 생성
		T01_api_car car1 = new T01_api_car();
		T01_api_car car2 = new T01_api_car();
		
		car1.power();
		
		int speed = car1.speed(100);
		System.out.println("현재 속도 : " + speed); // 100
		System.out.println("현재 속도 : " + car1.speed(100)); // 200
		
		speed = car1.speedDown();
		System.out.println("현재 속도 : " + speed); // 195
		System.out.println("현재 속도 : " + speed); // 195 , 이건 왜 똑같냐면
		
		car1.color = "검정색";
		System.out.println("차량 색상 : "+ car1.color);
		
		// 차량색상을 변수선언해서 넣으려면?
		//String car1Color = car1.color;
		
		System.out.println("--------------------------car2");
		
		System.out.println("car2의 현재속도 : " + car2.speed);
		System.out.println("car2의 색상 : " + car2.color);
		
		
		
		
		
		
		
		

	}

}
