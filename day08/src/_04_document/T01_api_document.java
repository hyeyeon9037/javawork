package _04_document;

public class T01_api_document {
	String name;
	static int count;
	
	
	T01_api_document() {
		System.out.println("제목 없음" + ++count);
	}
	
	T01_api_document(String name) {
		this.name = name;
		System.out.println("문서" + this.name + "생성됨");
	}
	

	
}
