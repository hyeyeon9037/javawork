package _04_car;

public class T01_api_car {

	// 속성 : 회사, 모델, 컬러(중간에 한번 바꾸기-> main에서 색바꾸기), 스피드, 시동
	//메소드 : 시동 켜고 끄기, 스피드 올리기(10씩증가), 스피드 내리기(10씩감소)
	
	String company = "연이의 차 맛집";
	String property = " yeon is car ";
	String color = "핑크";
	int speed;
	boolean start;
	
	void start() {
		start = !start;
		if(start)
			System.out.println("시동을 킵니다");
		else
			System.out.println("시동을 끕니다");
	}
		
		int speedUp() {
			speed += 10;
			return speed;
		}
	
		int speedDown()	{
			speed -= 10;
			return speed;
		}
		
		
	
}
