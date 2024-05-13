package _01_array;

public class T02_2차원배열 {

	public static void main(String[] args) {
		// 2차원 배열
		// 배열 [행의index][열의index]
		
		int[][] score = {{1, 2, 3, 4, 5}, // 인덱스번호: [0]
			         	{6, 7, 8, 9, 10},  // 인덱스번호: [1]
				        {11, 12, 13, 14, 15}}; // 인덱스번호: [2]
				       //[0] [1] [2] [3] [4]
				        
				        System.out.println(score[0][2]); // 3
				        System.out.println(score[2][3]); //14
				        System.out.println("행의 길이 : " + score.length);
				        System.out.println("score[0]의 길이(열길이) : " + score[0].length);
				        
				        
				    	/*
						score[0][0]
						score[0][1]
						score[0][2]
						score[0][3]
						score[0][4]						
								
						score[1][0]		        
						score[1][1]
						score[1][2]
						score[1][3]
						score[1][4]
						이걸 for문으로 쓰려고하면 ↓ 방법으로 ㄱㄱ
									*/									
								        
				        
		for(int i = 0; i<score.length; i++) { //score.length 대신 3 넣어도대
			for (int j =0; j<score[i].length; j++) { //score[i].length 대신 5 넣어도대
				System.out.print(score[i][j] + ", ");
			}
			System.out.println();					        
	}
		
		

		System.out.println("------------------------");
		
		
		/* 1,  3,  5,  7, 9
		  11, 13, 15, 17, 19
		  21, 23, 25, 27, 29
		score에 덮어씌어보기를 해보세요.
		
		*/
		
		/*
		 score[0][0] = 1
		 score[0][1] = 3
		 score[0][2] = 5
		 score[0][3] = 7
		 score[0][4] = 9
		 score[1][0] = 11
		 score[1][1] = 13
		        ...
		        
		        이런식의 규칙이니까 덮어쓰워보쟈
		        
		 */
        	int count = 1;
			for(int i = 0; i<score.length; i++) { //score.length 대신 3 넣어도대
					for (int j =0; j<score[i].length; j++) { //score[i].length 대신 5 넣어도대
						score[i][j] = count;	
						System.out.print(score[i][j] + ", ");
						count += 2;
					}
					System.out.println();					        
			}

			
			System.out.println("------------------------");
			
		
		int[][] iArr = { {1,2,3}, {4,5}, {6,7,8,8} };
		
		/*
		[][0].length = 3
		[][1].length = 2
		[][2].length = 4
		↑ for문으로 쓸때에 조건식을 score.length를 써줘야한다 
		*/
		
		for(int i = 0; i<iArr.length; i++) { //score.length 대신 3 넣어도대
			for (int j =0; j<iArr[i].length; j++) { //score[i].length 대신 5 넣어도대
				System.out.print(score[i][j] + ", ");
			}
			System.out.println();		
		
		
	}
}
}


