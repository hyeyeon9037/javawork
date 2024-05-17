package _06_EX;

class Excercise {
	
	
	private static Excercise singleton = new Excercise();
	
	private Excercise() {
		System.out.println("객체 생성");
	}
	
	public static Excercise getInstance() {
		System.out.println("객체 리턴");
		return singleton;
	}


public class _01 {

	public static void main(String[] args) {
		
		Excercise ex1 = Excercise.getInstance();
		Excercise ex2 = Excercise.getInstance();
		
		System.out.println("ex == ex : " + (ex1 == ex2));
	}

}
}