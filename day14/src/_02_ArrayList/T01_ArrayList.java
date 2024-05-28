package _02_ArrayList;

import java.util.*; // *하면 모든걸 import 한다는 뜻

public class T01_ArrayList {

	public static void main(String[] args) {
		/*
		<제네릭> : 자료형을 넣어주는 것을 권장한다.
				 여러 자료형을 받을 시 클래스를 만들어 객체로 넘겨주는 것을 권장한다.
				 
				 배열의 갯수 지정 가능 : 기본값 10개
				 		ArrayList<> 변수이름 = new ArrayList<>(배열의 갯수);

		*/
		
		ArrayList<String> alist = new ArrayList<String>(15);
		// 자식 객체를 부모타입으로 자동형변환하여 사용가능
		List<String> list = new ArrayList<String>();
		// List 는 인터페이스로 되어있음
	
		list.add("java"); //list[0]
		list.add("database"); //list[2]
		list.add("HTML"); //list[3]
		list.add(1, "객체 모델링"); //list[1]
		list.add("javascript"); //list[1]
		
		System.out.println("총 객체 수 : " + list.size());
		// System.out.println(list[3]); → 직접 인덱스를 사용 할 수 없다.
		System.out.println(list.get(3)); // get이라는 메소드를 이용해서 인덱스를 가져와야한다.
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}/*
			int count = 1;
			for (String str : list) {
				System.out.println(count++ + ". " + str);
			}
			*/
			System.out.println("------------------------");
				
			/*list.remove(2);
			for(int i = 0; i<list.size(); i++) {
				System.out.println(i+1 +". " + list.get(i));
			}*/
			
			list.remove(2);
			list.remove(2);
			list.remove("객체 모델링");
			list.remove(list.get(0));
			for(int i = 0; i<list.size(); i++) {
				System.out.println(i+1 +". " + list.get(i));
			}
				list.add("java");
				list.add("database");
				list.add("HTML");
				for(int i=0; i<list.size(); i++) {
					System.out.println(i+1 + ". " + list.get(i));
				}
				
				
				
				System.out.println("------------------------");
				
				// index자리에 기존 것을 삭제하고 들어간다.
				list.set(2, "객체 모델링");
				for (int i=0; i<list.size(); i++) {
					System.out.println(i+1 + ". " + list.get(i));
				}
				
				System.out.println(list.toString());
				
				
			
		}
	}


