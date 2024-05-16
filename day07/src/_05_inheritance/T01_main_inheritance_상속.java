package _05_inheritance;

class A {
	
	int aa = 10;

}

class B extends A {

	int bb = 200; // 10도 쓸 수 있고, 200도 쓸 수 있음 why?) A를 상속받았기 때문 (extends)
}


class C extends A {
	
	int cc = 500;
	
}

class D extends C {
	
	int dd = 1000; // 10, 500, 1000 쓸 수 있음 why?) D는 C를 상속받음. C는 A를 상속받음. D → C → A 
}


public class T01_main_inheritance_상속 {

	public static void main(String[] args) {
	
		A a1 = new A();
		System.out.println("a1.aa : " + a1.aa);
		
		B b1 = new B();
		System.out.println("b1.aa : " + b1.aa);
		System.out.println("b1.bb : " + b1.bb);
		
		C c1 = new C();
		System.out.println("c1.aa : " + c1.aa);
		System.out.println("c1.cc : " + c1.cc);
		
		D d1 = new D();
		System.out.println("d1.aa : " + d1.aa);
		System.out.println("d1.cc : " + d1.cc);
		System.out.println("d1.cc : " + d1.dd);
		
	}

}
