package _05_interface;

public class MySql_implements_DataAccess implements DataAccess {
	
	public void select() {
		System.out.println("MySql를 선택합니다.");
	}
	
	public void insert() {
		System.out.println("MySql를 삽입합니다.");
	}
	
	public void update() {
		System.out.println("MySql를 수정합니다.");
	}
	
	public void delete() {
		System.out.println("MySql를 삭제합니다.");
	}
}
