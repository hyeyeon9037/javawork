package _02_ByteStream;

import java.io.*;

public class ByteStreamApi {
	/*
	~~InputStream : ~~매체로부터 데이터를 입력받는 통로 (외부매체로부터 데이터를 읽어온다)
	~~OutputStream : ~~매체로부터 데이터를 출력받는 통로 (외부매체로부터 데이터를 내보낸다, 쓴다)	
	*/	
	
	

	//*1 외부매체 파일에 출력을 한다. 데이터를 파일로 내보내기. 즉, 파일로 저장한다는 소리
	void fileSave() {
		// FileOutputStream : 파일과 직접 연결해서 1byte 단위로 출력하는 스트림
		
		/* 순서
		 1. 스트림 생성 ( 통로만들기 )
		 2. 스트림으로 데이터를 출력
		 3. 다 사용한 후 스트림을 반납
		*/
		// 1. 스트림 생성
		
		FileOutputStream fout = null;

		try {			
			// 2. 파일에 데이터를 출력하고자 할때 Write메소드 사용
			fout = new FileOutputStream("file byte.txt"); // 파일이 없으면 만들어주고 있으면 통로로 연결함
		
			// try문을 또 선언. 근데 생략 가능
			// 숫자를 출력하든 문자를 출력하든 파일에 기록되는 건 문자로 기록 된다 (아스키코드)
			fout.write(97);
			fout.write('b');
			
			byte[] arr = {99, 65, 100};
			fout.write(arr);
			
			// write(매개변수 1개) : 매개변수에 잇는 문자를 쓰시오
			// write(byte[] b , int offset , int len) 
			fout.write(arr, 1, 2);
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 두번째 try문 선언한게 이거임
			e.printStackTrace();
		}
		
		// 3. 스트림 반납
		try {
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	//*2 외부매체로부터 파일을 읽어온다 (입력 : 파일로부터 데이터 가져오기)
	void fileRead() {
		// FileInputStream : 파일로부터 1byte 단위로 입력받는 스트림
	
		/* 순서
		 1. 스트림 생성 ( 통로만들기 )
		 2. 스트림으로 데이터를 출력
		 3. 다 사용한 후 스트림을 반납
		*/
		
		FileInputStream fin = null;
		
		try {
			// 1. 스트림 생성
			fin = new FileInputStream("file byte.txt");
			
			// 2. read() 메소드 이용
			// 1byte씩 아스키코드로 읽어옴(숫자)
			// 두번째 try문 생략
			
			/*	
				while(fin.read() != -1) { // fin.read()가 맨끝과 같지 않으면 반복해라
				System.out.println(fin.read()); // 이걸 7번 써야하기 때문에 반복문을 쓴것.
				}
				// 하나씩 건너 띄어서 나온다.
				 * 그러므로 다른걸 써보자!
			*/
			
			// 해결방법 1 ) 무한 반복으로 돌면서 매번 조건 검사
			while(true) {
				int value = fin.read();
				if(value == -1) // -1은 맨끝이라는 소리 인듯?
					break;
				System.out.println(value);
			}
			
			// ★ 해결방법 2 ) 권장방법
			int value =0;
			while((value = fin.read()) != -1 ) {
				System.out.println((char)value);
			}
			
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
	} finally {
		try {
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		
		
	}
	
	
	
	
}
