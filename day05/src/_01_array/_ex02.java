package _01_array;

public class _ex02 {

	public static void main(String[] args) {
		// 길이 10인 배열을 선언하고 1~10까지 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣고 값 출력
		
		int[] intArr = new int [10];
		
		for(int i =0; i<10; i++) {
			intArr[i] = 10-i;
			System.out.print(intArr[i]+ ", ");
			
		}
		
		
		
		
	}

}
