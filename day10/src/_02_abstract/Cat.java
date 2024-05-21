package _02_abstract;

public class Cat extends Pet{
	
	Cat() {
		super("길냥이", "삼색", "주인님");
	}
	
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	
	// void sound와 info는 쓸게없어도 "반드시" 넣어야함
	@Override
	void sound(){
	System.out.println("야옹");	
	}

	@Override
	void info() {
		
	}
	

}
