package _06_polymorphismEx;

public class Tv extends Product {
	
	Tv() { // 생성자 
		super(300);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
	
}
