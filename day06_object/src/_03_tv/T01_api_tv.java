package _03_tv;

public class T01_api_tv {

	String company = "LG";
	String model = "울트라";
	int inch = 65;
	int volume; // 값을 안넣으면 0으로 초기화가 된다는 소리
	int channel = 1;
	boolean power; // 기본 값 : false
	
	
	void power() {
		power = !power;		 //출력문 없음 , 한번 호출하면 true고 두번 호출하면 false임
		if (power) // true
			System.out.println("tv를 켭니다.");
		else  // false
			System.out.println("tv를 끕니다.");
	}
	
	int channelUp() {
		channel++;
		return channel;
		
	}
	int channelDown() {
		channel--;
		return channel;
	}
	int volume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
	
	
}
