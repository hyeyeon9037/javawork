package _02_exception;

public class T05_numberFormat {

	public static void main(String[] args) {
	
		/*		try {
				
				
				String[] str = {"23", "17", "a", "3.141592"}; // 정수랑 문자가 둘다 있음
				
				for(int i=0; i<str.length; i++) {
					int num = Integer.parseInt(str[0]); //Integer.parseInt : 인트형으로 바꿔주겠다 라는 뜻 <문자가 있기 대문에 try , catch문을 써줘야함>
					System.out.println(num);
				}
				
				} catch(NumberFormatException e) {
					System.out.println(str[2] + "정수로 변경할 수 없음"); // 지역변수라서 str[2] 로 쓸 수가 없음.
				}
		
		*/ //  따라서 밑에처럼 바꿔줘야함.
		
		String[] str = {"23", "17", "a", "3.141592"}; // 정수랑 문자가 둘다 있음
		int i=0;
		try {

			for(i=0; i<str.length; i++) { // int i=0 으로 설정 x 
				int num = Integer.parseInt(str[i]); //Integer.parseInt : 인트형으로 바꿔주겠다 라는 뜻 <문자가 있기 대문에 try , catch문을 써줘야함>
				System.out.println(num);
			}
			
			} catch(NumberFormatException e) {
				System.out.println(str[i] + "정수로 변경할 수 없음"); 
			}
		
		
		
	
	
	}

}
