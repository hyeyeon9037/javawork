package _01_File;

import java.io.File;
import java.io.IOException;

public class T01_File {

	public static void main(String[] args) {
		try {
			// 1. 경로지정을 하지 않으면 프로젝트 폴더에 생성이된다.
			File f1 = new File("test.txt");
			f1.createNewFile();// 이 메소드까지 실행해야만 파일이 생성이된다.
		
		
		// 2. 경로 지정해서 파일 만들기.
			File f2 = new File("C:\\tmp/test2.txt"); // C:\\tmp파일 안에 test2.txt를 만드세요 라는 뜻
		//	File f2 = new File("C:/tmp");  \\ 두개가 / 하나랑 똑같은 말임.
			f2.createNewFile();
			
			
			
		// 3. 폴더 만들고 그 폴더에 파일 생성
			File tempFolder = new File("C:/tmp");
			tempFolder.mkdir(); // mkdir = 폴더 생성 메소드 >> make directroy (디랙토리를 만든다느 뜻)
			
		
			File f3 = new File("C:/tmp/java.txt");
			f3.createNewFile();
			
			// 존재하는지 체크
			System.out.println("f1이 존재 하는가? : " + f1.exists());
			System.out.println("f2이 존재 하는가? : " + f2.exists());
			System.out.println("aaa.txt가 존재 하는가? : " + new File("aaa.txt").exists());
			
			//파일인지 아닌지
			System.out.println("f1은 파일인가? : " + f1.isFile());
			System.out.println("tempFolder는 파일인가? : " + tempFolder.isFile());
			

			//폴더인지 아닌지
			System.out.println("f1은 폴더인가? : " + f1.isDirectory());
			System.out.println("tempFolder는 폴더인가? : " + tempFolder.isDirectory());
			
			
			File folder = new File("folder"); 
			folder.mkdir(); // day 19 안에 폴더를 생성함
			
			File f4 = new File("folder/person.txt");
			f4.createNewFile(); // day 19 안에 있는 폴더 안에 파일을 생성함
			
			System.out.println("f4의 파일명 : " + f4.getName());
			System.out.println("f4의 절대 경로 : " + f4.getAbsolutePath());
			System.out.println("f4의 파일 용량 : " + f4.length());
			System.out.println("f4의 상위 폴더 : " + f4.getParent());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
			
		
		
		
		
		
		
	}

}
