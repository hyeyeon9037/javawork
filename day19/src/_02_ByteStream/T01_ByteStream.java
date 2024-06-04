package _02_ByteStream;

public class T01_ByteStream {

	public static void main(String[] args) {
		/*
		
		* Stream : 프로그램상의 데이터를 외부매체로부터 입력받거나 출력을 한다.
			   	   반드시 그 외부 매체와 통로를 만들어야 된다. 
		
		* Stream(통로) 특징
		- 단방향 : 입력 혹은 출력 하나만 사용가능
		→ 입력과 출력을 동시에 하고자 한다면? 
		    : 입력용 스트림 / 출력용 스트림을 따로 열어야 한다.
		
		- 선입선출(FIFO) : 통로가 파이프같은 개념이기 때문에 먼저 들어온 값이 먼저 나감
		- 시간지연(delay)라는 문제가 생길 수 있음
		
		* Stream의 구분
		> 통로의 사이즈 ( 1byte / 2byte )
		 - 바이트 스트림 : 1byte만 왔다 갔다 할 수 있는 정도의 사이즈 → 입력(InputStream) / 출력(OutputStream)
		 - 문자 스트림 : 2byte만 왔다 갔다 할 수 있는 정도의 사이즈 → 입력(Reader) / 출력(Writer)
		 
		> 외부매체와 직접연결 유무
		 - 기반 스트림 : 외부 매체와 직접 연결되는 통로 ( 필수 !! )
		 - 보조 스트림 : 보조 역할을 하는 통로 (속도를 빠르게 한다거나, 그 외 유용한 기능 제공을 해준다. )
		    		   → 단독 사용 불가 : 반드시 기반 스트림이 있어야 사용이 가능하다.
		
		*/
		
		ByteStreamApi stapi = new ByteStreamApi();
		// stapi.fileSave(); api에 첫번째 꺼 (*1)
		stapi.fileRead(); // api에 두번째 꺼 (*2)
		
		
		
		
		
	}

}
