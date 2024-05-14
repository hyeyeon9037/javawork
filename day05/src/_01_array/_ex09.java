package _01_array;

import java.util.Scanner;

public class _ex09 {

	public static void main(String[] args) {
		/*		사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
				단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
				   ex.
				   치킨 이름을 입력하세요 : 양념			
				   양념치킨 배달 가능
		
				   치킨 이름을 입력하세요 : 불닭
				   불닭치킨은 없는 메뉴입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] chickens = { "양념", "후라이드", "파닭", "허니버터"};
		System.out.println("치킨 이름 입력 : ");
		String menu = sc.next();
		
		boolean flag = false;
		for (int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])	) {
				flag = true;
				break;
				
			}
		}
		
		if(flag)
			System.out.println(menu + "치킨 배달 가능");
		else
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		
		
		
		
		
	}

}
