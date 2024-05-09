package EX;

import java.util.Scanner;

public class _08 {

	public static void main(String[] args) {
		// 8. 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.(입력받을 때 - 포함)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주민민번호를 적어주세요 <-포함> : ");
		char a = scan.next().charAt(7);
		
		String b = a == '1' || a == '3' ? "남자" : "여자";
		System.out.println(b);
		
		

	}

}
// 틀림. char로 써보자!!
// 이해 완 대신 아예 안보고 해보자