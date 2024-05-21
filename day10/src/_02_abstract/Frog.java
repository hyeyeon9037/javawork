package _02_abstract;

public class Frog extends Pet{
	
	Frog() {
		super("청개구리", "녹색", "기여오");
	}
	
	Frog(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	// void sound와 info는 쓸게없어도 "반드시" 넣어야함
	@Override
	void sound(){
	System.out.println("개굴개굴");	
	}

	@Override
	void info() {
		System.out.println("특징 : " + getFeature());
	}
	
}
