package _01_polymorphosm;

public class Dog extends Pet{
	
	Dog() {
		super("말티즈", "흰색", "똥 잘쌈");
	}
	
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	
	@Override
	void sound(){
	System.out.println("멍멍");	
	}

}
