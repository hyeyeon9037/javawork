package _04_Ex01;



public class T01_main_book {

	public static void main(String[] args) {
	// 생성할때 다른 값으로 넣고 출력하시오.
		
		int instanceValue;
		
		T01_api_book a1 = new T01_api_book();
		T01_api_book a2 = new T01_api_book("밍?");
		T01_api_book a3 = new T01_api_book("뮤?", 1);
		T01_api_book a4 = new T01_api_book("먕?", 1, 1);
		
		System.out.println("book1 : " + a1.bookName);
		
		System.out.println("book2 : " + a2.bookName);
		System.out.println("book2 : " + a2.ISBN);
		
		System.out.println("book3 : " + a3.bookName);
		System.out.println("book3 : " + a3.ISBN);
		
	}

	
}

