package _04_Ex;

public class Ex {

	void A(int a, int b) throws UserException {
		
		if ( a < 1 || a >100 || b < 1 || b >100 ) {
			throw new UserException("1~100사이의 숫자가 아닙니다.");
		}else {
			
			if(a%b == 0) {
				System.out.println(" true");
			} else {
				System.out.println(" false ");
			}
		}
	}
}
