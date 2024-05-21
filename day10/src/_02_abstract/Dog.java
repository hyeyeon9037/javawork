package _02_abstract;

public class Dog extends Pet{
	
	Dog() {
		super("말티즈", "흰색", "똥 잘쌈");
	}
	
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	// void sound와 info는 쓸게없어도 "반드시" 넣어야함
	@Override
	void sound(){
	System.out.println("멍멍");	
	}

	@Override
	void info() {
		System.out.println("종류 : " + super.getKind());
		
	}

}
