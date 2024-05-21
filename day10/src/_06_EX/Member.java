package _06_EX;

public class Member  {
	String name;
	int age;
	String gender;
	
	
	Member(){
		
	}

	Member(String name, int age, String gender) {
		this.name =name;
		this.age =age;
		this.gender =gender;
		
	}


	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	String getGender() {
		return gender;
	}
	
	@Override
	
	public String toString() {
		return " 이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender ;
		
	}
	

}
