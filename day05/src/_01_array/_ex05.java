package _01_array;

import java.util.Scanner;

public class _ex05 {

	public static void main(String[] args) {
		/*	
		 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
			   ex)
			   문자열 : application
			   문자 : i
			   application에 i가 존재하는 위치(인덱스) : 4 8 
			   i 개수 : 2
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String str = sc.next();
		
		System.out.println("찾을 문자열 : ");
		char search = sc.next().charAt(0);
		
		char[] carr = new char[str.length()]; // String에서 길이를 가져오려면 () < 괄호가 필요
		int count = 0;
		String index = "";
		
		for (int i=0; i<str.length(); i++) {
			carr[i] = str.charAt(i);
			if(carr[i] == search) {
				index += i + " ";
				count ++;
				
			}
		}
		System.out.println(str + "에 "+ search + "가 존재하는 위치 (인덱스) : " + count );
		System.out.println(search + "의 개수 : " + count);
		 
		
		
		
		
	}

}
