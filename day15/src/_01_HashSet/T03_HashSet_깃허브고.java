package _01_HashSet;

import java.util.Objects;

class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}

public class T03_HashSet_깃허브고 {

	public static void main(String[] args) {
		

	}

}
