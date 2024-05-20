package _02_car;

public class AmbulanceCar extends Car {

	boolean siren;
	
	AmbulanceCar(String model, String company){
		super(model, company);
	}
	
	
	void siren() {
		if(siren = !siren)
		System.out.println("삐요요요ㅛㅇ용요~~");
		else
			System.out.println("사이렌을 멈춤.");
	}
	
	void aid() {
		System.out.println("응급처치");
	}
}
