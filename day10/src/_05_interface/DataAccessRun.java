package _05_interface;

public class DataAccessRun {

	public static void main(String[] args) {
		
		MySql_implements_DataAccess MS = new MySql_implements_DataAccess();
		
		MS.select();
		MS.insert();
		MS.update();
		MS.delete();
		
		System.out.println("------------------------♡");
		
		Oracle_implements_DataAccess OR = new Oracle_implements_DataAccess();
		
		OR.select();
		OR.insert();
		OR.update();
		OR.delete();
		
		
	}

}
