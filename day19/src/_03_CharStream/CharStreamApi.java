package _03_CharStream;

import java.io.*;

public class CharStreamApi {
	// 문자기반 스토리 2byte 씩 전송
	/*
	~~Reader : 입력용 스트림
	~~Writer : 출력용 스트림
	*/
	
	/* 순서
	 1. 스트림 생성 ( 통로만들기 )
	 2. 스트림으로 데이터를 출력
	 3. 다 사용한 후 스트림을 반납
	*/
	
	//출력용 스트림
	void fileSave() {
		FileWriter fw = null;
		
		
		try {
			//1.
			fw = new FileWriter("file_char.txt");
			
			//2.
			fw.write('김');
			fw.write("와우 점심 시간 끝났다"); // 띄어쓰기도 세는거에 포함해야함
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'t','j','o','e','u','n'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			fw.close();
		}catch (IOException e ){
			e.printStackTrace();
		}
		
	}
		
	}
	
	// 입력용 스트림
	
	void fileRead() {
		FileReader fr = null;
	
	try {
		fr = new FileReader("file_char.txt");
		
		int value=0;
		while((value=fr.read()) != -1 ) {
			System.out.print((char)value);	//char 강제형변환안하면 숫자로뜸
			
			}
		
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
}
	
	
	
	
}
