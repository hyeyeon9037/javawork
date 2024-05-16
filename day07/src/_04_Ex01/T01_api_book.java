package _04_Ex01;

public class T01_api_book {
	//String bookName / int ISBN; / int price; 
	// 생성자 : 매개변수가 없는 것 , 1개 , 2개 ,3 개를 만드시오.
	
	String bookName;
	int ISBN;
	int price;
	
	T01_api_book() {
		this("JABA", 1234567, 35000);
	}
	
	T01_api_book(String bookName) {
		this(bookName, 2345678, 35000 );
	}

	T01_api_book(String bookName, int ISBN) {
		this(bookName, ISBN, 35000);
		
	}
		T01_api_book(String bookName, int ISBN, int price) {
			this.bookName = bookName;
			this.ISBN = ISBN;
			this.price = price;
		}
		
		                // ↓ 지역변수
		void Method(String name) {
			int localValue;
			System.out.println(localValue);
			System.out.println(name);
		}
	
}
