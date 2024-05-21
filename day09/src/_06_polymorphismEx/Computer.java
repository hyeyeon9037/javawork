package _06_polymorphismEx;

public class Computer extends Product {
	
	Computer() { // 생성자 
		super(120);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
	
}
