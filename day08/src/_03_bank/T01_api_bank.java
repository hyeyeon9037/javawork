package _03_bank;

public class T01_api_bank {
	
	private int balance;
	
	void deposit(int money) { //돈 입금
		balance += money;
	}
	
	void witdraw(int money) { // 돈 출금
		
		if ( balance >= money ) { //내가 찾고자하는 금액이 입금금액보다 크면 뽑을수 없음.
			
			balance -= money;
		} else
			System.out.println("잔고가 부족합니다.");
	}
	
	int getBalance() { // 잔고를 알고 싶을때
		return balance;
	}
	
}
