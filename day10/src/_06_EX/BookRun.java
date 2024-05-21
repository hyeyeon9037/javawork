package _06_EX;

public class BookRun {

	public static void main(String[] args) {

		Member member = new Member("홍길동", 30, "남성"); // member 객체 생성
        LibraryController libraryController = new LibraryController(member); // LibraryController 객체 생성

        libraryController.insertBook(new Book("자바의 정석", "남궁성", "도우출판사"));
        libraryController.insertBook(new Book("토지", "박경리", "민음사"));
        libraryController.insertBook(new Book("해리포터", "J.K. 롤링", "문학수첩"));

        System.out.println("책 목록:");
        for (Book book : libraryController.selectAll()) {
            System.out.println(book);
        }

        String searchTitle = "토지";
        Book foundBook = libraryController.searchBook(searchTitle);
        if (foundBook != null) {
            System.out.println("\n검색한 책 정보:");
            System.out.println(foundBook);
        } else {
            System.out.println("\'" + searchTitle + "\' 책을 찾을 수 없습니다.");
        }
    }
		
		
		
	}


