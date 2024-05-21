package _06_EX;

import java.util.ArrayList;

public class LibraryController {

	
	private Member MB = new Member();
	private ArrayList<Book> aList = new ArrayList<Book>();
	
	
    // 생성자
	public LibraryController(Member member) {
		this.MB = member;
	}

    // Member 정보 출력
    public void info() {
        System.out.println(MB.toString());
    }

    // 책 추가
    public void insertBook(Book book) {
        aList.add(book);
    }

    // 모든 책 조회
    public ArrayList<Book> selectAll() {
        return aList;
    }

    // 책 검색
    public Book searchBook(String bookTitle) {
        Book foundBook = null;
        for (Book book : aList) {
            if (book.getTitle().equals(bookTitle)) {
                foundBook = book;
                break;
            }
        }
        return foundBook;
    }

	

}
