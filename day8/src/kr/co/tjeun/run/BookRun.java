package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book; // class 이름 : kr ~ book , 객체생성하기 위해서 필요함

public class BookRun {

	public static void main(String[] args) {

		//초기화 방법 1. 기본 생성자로 객체를 생성하여 getter/setter 메소드로 값 초기화
		
		Book book = new Book(); // 객체 생성
		book.setTitle("Jaba");
		book.setAuthor("김지원");
		book.setPrice(35000);
		book.setPublisher("tjeun");
		System.out.println(book.information());
		
		//초기화 방법 2. 매개변수가 있는 생성자 이용
		
		Book book2 = new Book ("springBoot", "이강도", 27000, "저강도");
		System.out.println(book2.information());
		
		// 사용자로부터 값을 입력받아 초기화하여 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		/* 1번째 방법
		System.out.println("도서명 : ");
		String title1 = sc.nextLine();
		
		System.out.println("저자명 : ");
		String author1 = sc.nextLine();
		
		System.out.println("가격 : ");
		int price1 = sc.nextInt();
		
		System.out.println("출판사 : ");
		String publisher1 = sc.nextLine();
		
		
		Book book3 = new Book(title1, author1, price1, publisher1);
		System.out.println(book3.information());
		*/
		
		/* 2번째 방법
		Book book4 = new Book();
		Sytem.out.println("도서명 : ");
		book4.setTitle(sc.nextLine());
		
		System.out.println("저자명 : ");
		book4.setAuthor(sc.nextLine());
		
		System.out.println("가격 : ");
		book4.setPrice(sc.nextInt());
		
		System.out.println("출판사 : ");
		book4.setPublisher(sc.nextLine());
		*/
		
		
		
	
		//관리 해야 되는데 일반 변수 사용
		Book book01 = null;
		Book book02 = null;
		Book book03 = null;
		
		
		for (int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 도서 정보 입력");
			
			System.out.println("도서명 : ");
			String title1 = sc.nextLine();
			
			System.out.println("저자명 : ");
			String author1 = sc.nextLine();
			
			System.out.println("가격 : ");
			int price1 = sc.nextInt();
			sc.nextLine();
			
			System.out.println("출판사 : ");
			String publisher1 = sc.nextLine();
			
			if(i == 0)
			book01 = new Book(title1, author1, price1, publisher1);
			
			else if (i == 1)
				book02 = new Book(title1, author1, price1, publisher1);
			
			else 
				book03 = new Book(title1, author1, price1, publisher1);
				
		}
		
		
		System.out.println(book01.information());
		System.out.println(book02.information());
		System.out.println(book03.information());
		

		
		// 도서 제목으로 검색하는 서비스
		
	
		
		System.out.println();
		String search = sc.next();
		
		if(book01.getTitle().equals(search)) {
			System.out.println(book01.information());
		}
		
		if(book01.getTitle().equals(search)) {
			System.out.println(book02.information());
		}
		
		if(book01.getTitle().equals(search)) {
			System.out.println(book03.information());
		}
	
		if(!book01.getTitle().equals(search) && !book02.getTitle().equals(search)&& !book03.getTitle().equals(search)) {
			System.out.println("그런 책 음슴");
		}
		
		
		
		
		
		
	}

}
