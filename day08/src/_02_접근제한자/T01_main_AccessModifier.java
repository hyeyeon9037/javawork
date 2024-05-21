package _02_접근제한자;

public class T01_main_AccessModifier {

	public static void main(String[] args) {
		
		T01_api_AccessModifier a1 = new T01_api_AccessModifier();
		
		a1.setPriNum(10);
		System.out.println(a1.getPriNum()); // get은 출력값에 써야함!
		int num = a1.getPriNum();
		
		
	}

}
