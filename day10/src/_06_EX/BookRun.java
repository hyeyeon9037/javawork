package _06_EX;

public class BookRun {

	public static void main(String[] args) {

		Member member = new Member("홍길동", 30, "남성"); // member 객체 생성
        LibraryController libraryController = new LibraryController(member); // LibraryController 객체 생성에 member 넣음

        libraryController.insertBook(new Book("자바의 정석", "남궁성", "도우출판사")); // Book은 String 이라서 ()안에 3개 다 말쓰는거임
        libraryController.insertBook(new Book("토지", "박경리", "민음사"));
        libraryController.insertBook(new Book("해리포터", "J.K. 롤링", "문학수첩"));

        System.out.println("책 목록:");
        for (Book book : libraryController.selectAll()) { // 위에 있는 inserBook을 출력해주는 for문
            System.out.println(book);
        }

        String searchTitle = "토지"; // 검색하려는 책 이름
        Book foundBook = libraryController.searchBook(searchTitle);
        // Book 에 foundBook 생성 
        if (foundBook != null) {  // null값이 아니라면
            System.out.println("\n검색한 책 정보:");
            System.out.println(foundBook);
        } else {
            System.out.println("\'" + searchTitle + "\' 책을 찾을 수 없습니다.");
        }
    }
		
		
		
	}


