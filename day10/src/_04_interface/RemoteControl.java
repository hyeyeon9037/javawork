package _04_interface;

public interface RemoteControl {
	public static final int MAX_VOLUME = 100;
	//public static final을 붙이지 않으면 컴파일시 자동으로 붙인다.
	int MIN_VOLUME =0;
	
	public abstract void turnOn();
	// public abstract을 붙이지 않으면 컴파일시 자동으로 붙인다.
	
	
	
	void turnOff();
	void setVolume(int volume);
	/*
	오류 원인 : interface에는 추상메서드만 들어올 수 있기 때문.
	void setChannel(int channel) {
		System.out.println(channel);
		*/
	}
	
