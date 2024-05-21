package _06_EX;

public class Book {

	String title;
	String author;
	String publisher;

	Book(){
		
	}
	
	Book(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
		
		String getTitle() {
			return title;
		}
		
		String getAuthor() {
			return author;
		}
		
		String getPublisher() {
			return publisher;
		}
		
		@Override
		
		public String toString() {
			return " 제목 : " + title + ", 저자 : " + author + ", 출판사 " + publisher ;
			
		}
		
		
		
	
	
}
