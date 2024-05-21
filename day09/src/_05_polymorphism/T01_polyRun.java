package _05_polymorphism;


class A {int a = 1;}
class B extends A {int b = 2;} // A, B
class C extends A {int c = 3;} // A, C
class D extends B {int d = 4;} // A, B, D
class E extends C {int e = 5;} // A, C, E



public class T01_polyRun {
	public static void main(String[] args) {
		// 자동 형 변환 : 자식을 부모 타입으로 형 변환
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		// 객체생성
		
		
		// A의 변수 int a= 1 로 형 변환 한것임 
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		// B b1 = c; 오류 : c는 b 객체 생성이 안되어있음 

		System.out.println(b.a);
		System.out.println(b.b);
		
		
		
		System.out.println(a1.a); 
		System.out.println(a2.a); 
		System.out.println(a3.a); 
		System.out.println(a4.a); 
		//System.out.println(a1.b); → A클래스 타입을 형 변환 했기 때문에 A클래스만 사용할 수 있다.
		
		
	}

}
