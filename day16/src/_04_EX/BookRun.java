package _04_EX;

import java.util.Scanner;

public class BookRun {
    private BookController bc;
    private Scanner scanner;

    public BookRun() {
        bc = new BookController();
        scanner = new Scanner(System.in);
    }


    public void showMenu() {
        System.out.println("******* 메인 메뉴 *******");
        System.out.println("1. 새 도서 추가");
        System.out.println("2. 도서 전체 조회");
        System.out.println("3. 도서 검색 조회");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 도서 명 오름차순 정렬");
        System.out.println("6. 종료");
        System.out.println("************************");
    }

    public void run() {
        int choice;
        do {
            showMenu();
            System.out.print("메뉴를 선택하세요: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            switch (choice) {
                case 1:
                    insertBook();
                    break;
                case 2:
                    listAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    ascBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택함 다시 선택해주세요.");
            }
        } while (choice != 9);
    }

    private void insertBook() {
        System.out.println("도서 정보를 입력하세요.");
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("장르: ");
        String category = scanner.nextLine();
        System.out.print("가격: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        bc.insertBook(new Book(title, author, category, price));
        System.out.println("도서가 추가되었습니다.");
    }

    private void listAll() {
        bc.listAll();
    }

    private void searchBook() {
        System.out.print("검색할 책의 제목을 입력하세요: ");
        String title = scanner.nextLine();
        Book foundBook = bc.searchBook(title);
        if (foundBook != null) {
            System.out.println(foundBook);
        } else {
            System.out.println("검색하는 책이 없습니다.");
        }
    }

    private void deleteBook() {
        System.out.print("삭제할 책의 제목을 입력하세요: ");
        String title = scanner.nextLine();
        System.out.print("삭제할 책의 저자를 입력하세요: ");
        String author = scanner.nextLine();

        Book deletedBook = bc.deleteBook(title, author);
        if (deletedBook != null) {
            System.out.println("도서를 삭제하였습니다: " + deletedBook);
        } else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }

    private void ascBook() {
        bc.ascBook();
        System.out.println("도서를 제목순으로 정렬하였습니다.");
    }

    public static void main(String[] args) {
        BookRun bookRun = new BookRun();
        bookRun.run();
    }
}