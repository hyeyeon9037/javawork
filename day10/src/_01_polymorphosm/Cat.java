package _01_polymorphosm;

public class Cat extends Pet{
	
	Cat() {
		super("길냥이", "삼색", "주인님");
	}
	
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	
	@Override
	void sound(){
	System.out.println("야옹");	
	}
	

}
