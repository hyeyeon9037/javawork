package _04_EX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookController {
    private ArrayList<Book> list;

    public BookController() {
        list = new ArrayList<>();
        // 생성자에서 리스트에 Book 객체 4개 추가
        list.add(new Book("나는 책이야1", "나는 작가야1", "나는 장르야1", 1));
        list.add(new Book("나는 책이야2", "나는 작가야2", "나는 장르야2", 2));
        list.add(new Book("나는 책이야3", "나는 작가야3", "나는 장르야3", 3));
        list.add(new Book("나는 책이야4", "나는 작가야4", "나는 장르야4", 4));
    }

    public void insertBook(Book book) {
        // list 맨 뒤에 책 추가
        list.add(book);
    }

    public void listAll() {
        // 리스트 목록 모두 출력
        for (Book book : list) {
            System.out.println(book);
        }
    }

    public Book searchBook(String title) {
        // 책 검색하여 객체 리턴
        for (Book book : list) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null; // 해당하는 책이 없을 경우 null 반환
    }

    public Book deleteBook(String title, String author) {
        // 책 제목과 저자가 맞으면 해당 책 삭제하고 객체 리턴
        for (Book book : list) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                list.remove(book);
                return book;
            }
        }
        return null; // 해당하는 책이 없을 경우 null 반환
    }

    public void ascBook() {
        // 책 제목을 기준으로 오름차순 정렬
        Collections.sort(list, Comparator.comparing(Book::getTitle));
    }

    public static void main(String[] args) {
        BookController controller = new BookController();
        controller.listAll();
        System.out.println();

        controller.insertBook(new Book("Machine Learning", "Andrew Ng", "Computer Science", 50));
        controller.listAll();
        System.out.println();

        Book searchedBook = controller.searchBook("Java Programming");
        if (searchedBook != null) {
            System.out.println("Searched Book: " + searchedBook);
        } else {
            System.out.println("Book not found.");
        }
        System.out.println();

        Book deletedBook = controller.deleteBook("Design Patterns", "Alan Turing");
        if (deletedBook != null) {
            System.out.println("Deleted Book: " + deletedBook);
        } else {
            System.out.println("Book not found or not deleted.");
        }
        System.out.println();

        controller.ascBook();
        controller.listAll();
    }
}
