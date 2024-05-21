package _08_polymorphismArrayList;

import java.util.ArrayList;

public class Buyer {

	int money = 500;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>(); // <> 안에 객체(자료타입)가 들어감
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p); // cart에 p를 넣으시오. 
		
		System.out.println(p + "를 구입함");
	}
	
	void info() { //info 는 지역변수
		int sum = 0;
		String list = "";
		
		if(cart.isEmpty()) {
			System.out.println("구입한 제품이 없습니다.");
			return;
		} 
			
		
		for(int i=0; i<cart.size(); i++) { // size 는 지금 있는 갯수만큼 (ex : 3개가 들어가있다. → size :3 )
			Product p1 = cart.get(i);
			sum += p1.price;
			list += p1 + ", " ;
			
		}

		System.out.println(" 구입한 물품의 총액 : " + sum + "만원입니다");
		System.out.println(" 구입한 물품의 목록 : " + list);
		
	}
	
	void refund(Product p) {
		if(cart.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "반품");
		}
		else {
			System.out.println("구입하지 않은 상품입니다.");
		}
	}
	
	
}
