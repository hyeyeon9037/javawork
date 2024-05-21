package _06_polymorphismEx;

public class Buyer {

	int money = 500;
	int bonusPoint;

	/*
	void buy(Computer com) {
		
	}
	void buy(Tv tv) {
		
	}
	
	void buy(GameDevice game) {
		
	}
	*/
	
	void buy(Product p) { // 주석처리 안에 있는것들이 Product p로 선언하면 똑같은 의미
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
	
}
