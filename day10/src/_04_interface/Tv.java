package _04_interface;

public class Tv implements RemoteControl {
/*
	interface 
	- 상속 받을 때 키워드는 implements
	- 다중 상속 가능
	*/
	
	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("Tv를 킴");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끔");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
	else
		this.volume = volume;
		System.out.println("현재 음량 : " + this.volume); //volume만 하면 지역변수임
		
	}
	
	
}
