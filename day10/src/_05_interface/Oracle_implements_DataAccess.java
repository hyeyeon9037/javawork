package _05_interface;

public class Oracle_implements_DataAccess implements DataAccess{

	public void select() {
		System.out.println("Oracle을 선택합니다.");
	}
	
	public void insert() {
		System.out.println("Oracle을 삽입합니다.");
	}
	
	public void update() {
		System.out.println("Oracle을 수정합니다.");
	}
	
	public void delete() {
		System.out.println("Oracle을 삭제합니다.");
	}
	
}
