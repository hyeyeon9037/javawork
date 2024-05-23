package _01_langPackage;

class Value {
	int value;
	Value(int value) { // value 타입
		this.value = value;
		
	}
	
	@Override
	public boolean equals(Object o ) { // object 타입
	//	this.value == o.value; 타입이 달라서 오류가 뜸
		boolean b = value == ((Value)o).value; // 따라서 형변환을 해줘야함
		return b;
	}
}




public class T01_equals {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		//Object클래스의 equals는 주소가 같은가?를 물어봄
		//오버라이딩으로 값이 같은가를 묻는 메소드를 만들어서 사용한다.
		
		if(v1.equals(v2)) // v1과 v2가 같은가를 물어보는거 ( 위 오버라이딩을하면 같다로 뜸 ) 
			System.out.println("v1과 v2가 같다");
		else
			System.out.println("v1과 v2가 다르다");
		
		Value v3 = v1;
		if(v1.equals(v3)) // v1과 v2가 같은가를 물어보는거
			System.out.println("v1과 v3가 같다");
		else
			System.out.println("v1과 v3가 다르다");
		// v3은 주소가 같기 때문에 같다고 뜬다
		
	}

}
