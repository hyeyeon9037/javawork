package _02_exception;

public class T09_tryCatchFinally {

	public static void main(String[] args) {
		
		// 배열을 3개 했음 run에서 지정
	
		/*
		 	try {
				
			} catch() {
				
			} finally {
				//예외와 상관없이 실행
				try와 catch에 return이 있어도 실행이 된다.
			}
			출력문(try와 catch에 return이 있으면 실행이 되지 않음.
			*/
		
		try {
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[4]); // 오류
		return;
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스의 범위를 넘어섬");
			return;
			
		}finally {
			System.out.println("프로그램 종료"); // 아무상관없이 실행됨
		}
	//	System.out.println("ddddd"); < return 때문에 실행 불가
		
		
	
	}

}
