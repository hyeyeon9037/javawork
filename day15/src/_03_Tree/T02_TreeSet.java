package _03_Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("구매할 횟수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i++) {
			ts.clear();
		while(ts.size() < 6 ) {
				
			ts.add((int)(Math.random()*45)+1);
		}

			System.out.println(ts);
		}
		
		
	}

}
