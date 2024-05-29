package _01_HashSet;

import java.util.*;

class ClassA {
	String str;
	
	public ClassA() { //생성자		
	}
	
	public ClassA (String str) {
		this.str = str;
	}
	
}



public class T01_HashSet {
	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		
		ClassA ca1 = new ClassA("a");
		set2.add(ca1);
		set2.add(new ClassA("oracle"));
		set2.add(new ClassA("sql"));
		set2.add(new ClassA("react"));
		set2.add(new ClassA("jsp"));
		
		int size = set2.size();
		System.out.println("저장된 객체의 객수 : " + size);
		/*	
			Iterator<ClassA> i = set2.iterator();
			System.out.print("set2 출력 : ");
			while(i.hasNext()) {
				ClassA ca = i.next(); // 꺼내오는것이 next임
				System.out.print(ca.str + " ");
			}
			System.out.println();
			밑에 static도 똑같은 말임
			*/
		// 출력 시 계속 호출이 되도록 메소드로 구현
		iteratorPrint(set2.iterator());
		
		set2.add(new ClassA("AWS"));
		iteratorPrint(set2.iterator());
		
		// oracle을 삭제하고 싶을 때  
		Iterator<ClassA> i = set2.iterator();
		while(i.hasNext()) {
			ClassA ca = i.next(); 
			String s = ca.str;
			if(s.equals("oracle"))
				i.remove();
		}
		
		iteratorPrint(set2.iterator());
		
		
	}
	
	static void iteratorPrint(Iterator<ClassA> i ) { //iteratorPrint 호출  , Iterator<ClassA> i : 매개변수
		while(i.hasNext()) {
			ClassA ca = i.next(); // 꺼내오는것이 next임
			System.out.print(ca.str + ", ");
		}
		System.out.println();
		
		
		
	}
	
}
