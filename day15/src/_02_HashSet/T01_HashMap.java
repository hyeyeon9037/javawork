package _02_HashSet;

import java.util.*;

public class T01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("아무개", 95);
		map.put("홍길동", 90);
		map.put("이소영", 85);
		map.put("최서진", 67);
		System.out.println("size : " + map.size());
		
		
		// get(키) : 결과는 값이 리턴됨
		System.out.println("점수 : " + map.get("홍길동"));
		
		System.out.println(map);
		
		// remove(키) : 객체삭제
		map.remove("이소영");
		System.out.println(map);
		
		
	}

}
