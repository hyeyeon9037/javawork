package _02_car;

public class CarRun {

	public static void main(String[] args) {
		AmbulanceCar Car1 = new AmbulanceCar("mod", "com");
		System.out.println("model 명 : " + Car1.model);
		System.out.println("company 명 : " + Car1.company);
	
		
		Car1.powerUp();
		Car1.speedUp();
		Car1.siren();
		Car1.aid();
		Car1.speedDown();
		Car1.powerOut();
		
		
		

	}

}
