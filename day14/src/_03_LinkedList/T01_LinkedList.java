package _03_LinkedList;

import java.util.*;

public class T01_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(0,1);
		list.addFirst(0);
		list.addLast(20);
		list.add(50);
		System.out.println(list);
		
		
		list.remove(1); // index 1번 삭제
		System.out.println(list);
		list.remove(); // 맨 앞노드 삭제
		System.out.println(list);
		list.removeFirst(); // 맨 앞노드 삭제
		System.out.println(list);
		
		list.removeLast(); // 맨 끝노드 삭제
		System.out.println(list);
		/*
		for문을 쓰면 비효율적임 → 검색 속도 느려짐 : i번째 주소는 i-1번에 들어있어서 i-1을 먼저 찾아야하고, 
						   				 	i-1 주소를 찾으려면 i-2를 먼저 찾아야됨
											결과적으로 0~i까지 다시 돌아야 됨
		*/
		for(int i=0; i<list.size(); i++) {
			list.get(i);
			
		}
		
		// Iterator : 리스트를 순화할 수 있게 해주는 클래스
		Iterator<Integer> iterator = list.iterator();
		// hasNext() : 남아있는 객체가 있는가? 있으면 true, 없으면 false 반환
		while(iterator.hasNext()) {
			//next() : 순회하면서 객체를 얻어온다.
			System.out.println(iterator.next() + " " );
		}
		
		
	}
}
