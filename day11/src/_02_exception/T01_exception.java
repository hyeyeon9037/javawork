package _02_exception;

public class T01_exception {

	public static void main(String[] args) {
		try {
			//예외가 나올 수 있는 프로그램
			System.out.println(3);
			System.out.println(4);		
		} catch(Exception e) {
			//예외가 발생 했을 때 수행
			System.out.println(5);
		}
		System.out.println(6);
			
			
			
	/*		// 예외가 나올 수 있는 프로그램
			int a = 5/0; // catch로 들어감
			System.out.println(a);
			int b = 5/2; // 예외
			System.out.println(b);
		} catch (Exception e ) { // 예외 발생에 대한 메세지
			//예외가 발생 했을 때 수행
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}
		*/

	}
}
