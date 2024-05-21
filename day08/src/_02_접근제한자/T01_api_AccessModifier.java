package _02_접근제한자;

public class T01_api_AccessModifier {
	private int priNum = 5;
	
	void setPriNum (int priNum) { // set을 대부분씀 >> private를 값을 넣어주는 역할
		this.priNum = priNum;
	} 
	int getPriNum () { // get을 대부분씀 >> void를 얻어오는 역할
		return priNum;
	}
	
	
	
}
