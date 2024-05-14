package _03_tv;

public class T01_main_tv {

	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in); // sc : 주소, System.in :  매개변수 

		
		T01_api_tv tv1 = new T01_api_tv();
		
		System.out.println(" 회사명 : " + tv1.company);
		System.out.println(" 모델명 : " + tv1.model);
		System.out.println( tv1.inch + "인치");
		
		tv1.power();
		//System.out.println("tv상태 : " + tv1.power); <- if , else 썼기때문에 굳이 또 안써도 댐
		
		System.out.println("현재 채널 : "+ tv1.channelUp()); // 2 출력 ++ 
		System.out.println("현재 채널 : "+ tv1.channelUp()); // 3 출력 ++
		
		System.out.println("현재 채널 : "+ tv1.channelDown()); // 2 출력 --
		System.out.println("현재 채널 : "+ tv1.channelDown()); // 1 출--
		
		System.out.println(tv1.volume(12));
		
		tv1.power();
		//System.out.println("tv상태 : " + tv1.power); <- if , else 썼기때문에 굳이 또 안써도 댐
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
