package _02_exception;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class T06_classCast {

	public static void main(String[] args) {

		/*	방법1	
		  try {
				Animal ani = new Animal();
				Dog dog = new Dog();
				Cat cat = new Cat();
				
				Animal aniDog = dog; //Animal로 형변환
			Animal aniCat = cat; //Animal로 형변환
			
			dog = (Dog)aniDog; // dog로 강제 형변환 하시오라는 뜻
			dog = (Dog)ani; // 오류 뜸 > 오류뜨는건 try catch 문으로 ㄱㄱ
				
				// 위에 dog = (Dog)ani;를 안 쓰고 싶으면 try catch문 안쓰고 if else로 써도 가능
			 ------------------------------------------
				if(ani instanceof Dog) {
					dog = (Dog)ani;
				}else {
					System.out.println("변경 불가");
				}
			 ------------------------------------------
			
		} catch(ClassCastException e) {
			System.out.println("부모타입을 자식의 타입으로 형 변환 할 수 없음");
			}
				*/
		
		
				// 방법 2 static 붙을 때
				Dog dog = new Dog(); 
				change(dog); 
				
			public static Dog change(Animal animal) { 
				Dog dog = null;
				if(animal instanceof Dog) {
				 dog = (Dog)animal;
				}else {
					System.out.println("변경 불가");
				}
				return dog;
				
				
				Dog dog = new Dog(); 
				change(dog); 
				if ( d == null) {
					
				}else {
					
				}
	
		
	/* 방법 2-1 ) static 안붙었을 때   

	T06_classCast t = new T06_classCast(); // // 객체 생성 
	Dog dog = new Dog(); 
	t.change(dog);
	}

	public void change(Animal animal) { // static 이 안붙으면 객체 생성 해야 쓸수 있음 ▶ 만약 붙으면 위에있는 객체생성을 없애도 댐
	Dog dog = (Dog)animal;*/

		
	/*// 방법 3
	Dog dog = new Dog(); 
	if((change(Dog)) == null) {
		System.out.println("변환불가");
	} else {
		dog = change(dog);
	}
	
	public static Dog change(Animal animal) { 
	Dog dog = null;
	if(animal instanceof Dog) {
	 dog = (Dog)animal;
	}else {
		System.out.println("변경 불가");
	}
	return dog;
	
	
	*/


	} 
	
}

