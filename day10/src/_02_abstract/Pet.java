package _02_abstract;

//추상 클래스 : 클래스 앞에 abstract 키워드 사용 
//			 추상 메서드가 1개 이상 포함 되어 있으면 "반드시" 추상클래스로 만들어줘야함.
abstract public class Pet {
	
	private String kind;
	private String color;
	private String feature;
	
	Pet (String kind, String color, String feature){ //pet의 생성자
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	//추상 메서드 : 메서드 앞에 abstract 키워드 사용
	//			 선언부만 있고 실행부가 없는 메서드
	//			 상속받는 곳에서 "반드시" 구현해야함.
	abstract void sound();
	abstract void info();
	
	String getKind() {
		return kind;
	}
	

	String getColor() {
		return color;
	}
	
	String getFeature() {
		return feature;
	}
	
	
	@Override
	
	public String toString() {
		return "종류 : " + kind + ", 색상" + color;
	}
	

}
