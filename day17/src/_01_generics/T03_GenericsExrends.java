package _01_generics;

import java.util.*;

class Fruit{
	@Override
	public String toString() {
		return "";
		
	}
}

class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}

class Banana extends Fruit{
	@Override
	public String toString() {
		return "Banana";
	}
}


class Tjoeun {
	@Override
	public String toString() {
		return "Tjoeun";
	}
}


class Box2<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int i ) {
		return list.get(i);
		
	}
	
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
	
}


public class T03_GenericsExrends {

	public static void main(String[] args) {
		
		Box2<Fruit> fruitBox = new Box2<>();
		Box2<Apple> appleBox = new Box2<>();
		Box2<Tjoeun> tjoeunBox = new Box2<>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Banana());
		// 		fruitBox.add(new Tjoeun()); Fruit와 관련이 없어서 오류가 뜸
		
		
		appleBox.add(new Apple()); // appleBox는 Apple만 담을 수 있다.
		// appleBox.add(new Fruit()); 부모는 안댐
		
		tjoeunBox.add(new Tjoeun()); // Tjoeun만 담을 수 있다
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(tjoeunBox);
		
		
		
		
		
	}

}
