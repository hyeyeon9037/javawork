package _02_comparable;

import java.util.*;

class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int compareTo(Person o) {
		if(age < o.age)
			return -1;
		else if (age == o.age)
			return 0;
		else
			return 1;
		// 가장 낮은것부터 정렬을 해주는 코드.

		
	}
	
}

public class T01_comparable {

	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<Person>();
		// 그냥 set으로 하면 무작위로 결과값이 나옴, treeset은 정렬이 되서 나옴. (결과값 봐봐!)
		treeset.add(new Person("배고파", 45));
		treeset.add(new Person("김효빈", 25));
		treeset.add(new Person("박혜연", 26));
		
		
		Iterator<Person> iterator = treeset.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : " + person.age);
		}
		
	}

}
