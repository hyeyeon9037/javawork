package _03_Tree;

import java.util.*;

public class T03_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("apple", 1000);
		treeMap.put("banana", 3000);
		treeMap.put("cherry", 2000);
		treeMap.put("grape", 5000);
		treeMap.put("mango", 1000);
		treeMap.put("orange", 500);
		
		System.out.println("[c~n 사이의 단어 검색]");
		treeMap.subMap("c", true,"n", true);
		NavigableMap<String, Integer> ravigaMap = treeMap.subMap("c", true, "n", true);
		for(Entry<String, Integer> entry : raviMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
				
	
	
	
	}

}
