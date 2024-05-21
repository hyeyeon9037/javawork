package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookArrayRun {

	public static void main(String[] args) {

		Book[] books = new Book[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + " 번째 도서 입력 ");

			System.out.println("도서명 : ");
			String title1 = sc.nextLine();

			System.out.println("저자명 : ");
			String author1 = sc.nextLine();

			System.out.println("가격 : ");
			int price1 = sc.nextInt();
			sc.nextLine(); // 출판사 나오게해주려고 엔터 해주는거임

			System.out.println("출판사 : ");
			String publisher1 = sc.nextLine();

			books[i] = new Book(title1, author1, price1, publisher1);

		}
		for (int i = 0; i < 3; i++) {
			System.out.println(books[i].information());
		}
		
		/* 향상된 for문 쓴다면?
		 * for( Book book : books ) {
		 *  Ststem.out.println(book.information());
		 */
		
		//도서 제목으로 검색하는 서비스
		System.out.println(" 출판사 입력 : ");
		String search = sc.next();
		
		for(int i=0; i<books.length; i++) {
			if(search.equals(books[i].getTitle()))
				System.out.println(books[i].information());
			
		}
		
		
	}
}
