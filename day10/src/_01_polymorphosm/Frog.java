package _01_polymorphosm;

public class Frog extends Pet{
	
	Frog() {
		super("청개구리", "녹색", "기여오");
	}
	
	Frog(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	@Override
	void sound(){
	System.out.println("개굴개굴");	
	}
	
}
