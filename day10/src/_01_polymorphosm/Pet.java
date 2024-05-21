package _01_polymorphosm;

public class Pet {
	//부모
	
	private String kind;
	private String color;
	private String feature;
	
	Pet (String kind, String color, String feature){ //pet의 생성자
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	
	void sound() {
		System.out.println("이 아이의 소리는 ~?! : " );
	}
	
	void info() {
		System.out.println("색상 : " + color + "종류 : " + kind );
	}
	
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
