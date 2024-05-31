package _01_generics;

class Delivery<T> {
	private T t;
	void set(T t) {
		this.t = t;
	}
	
	T get() {
		return t;
	}
	
}

class Gmarket<T> {}


public class T02_Generics {

	public static void main(String[] args) {
		Delivery<String> del = new Delivery<>();
		del.set("program");
		String str = del.get();
		
		Delivery<Integer> del2 = new Delivery<>();
		del2.set(7);
		int value = del2.get();
		
		Delivery<Gmarket> del3 = new Delivery<>();
		del3.set(new Gmarket());
		Gmarket g = del3.get();
		
		/*
		Delivery<Gmarket> del4 = new Delivery<>();
		del3.set(new String()); // Delivery<Gmarket> 에서 Gmarket을 넣었기 때문에 new String()이 들어오면 안됨.
		Gmarket g1 = del4.get(); // 출력 값이 나오기 전 까진 오류인지 모름
		*/
		
		
		
		
	}

}
