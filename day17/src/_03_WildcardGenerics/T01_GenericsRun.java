package _03_WildcardGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		
		/*
		Applicent<Person> ap = new Applicent<>(new Person());
		Applicent<Person> ap2 = new Applicent<>(new Person());
		Applicent<Person> ap3 = new Applicent<>(new HighStudent());
		*/
		
		// 모든사람 신청 가능
		
		Course.registerCourse(new Applicent<Person>(new Person()));
		Course.registerCourse(new Applicent<Worker>(new Worker()));
		Course.registerCourse(new Applicent<Student>(new Student()));
		Course.registerCourse(new Applicent<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicent<MiddleStudent>(new MiddleStudent()));
		
		
		System.out.println("-------------------------------");
		
		
		// 학생만 신청 가능
		
		//	Course.registerCourse(new Applicent<Person>(new Person())); // 부모는 쓸 수 없음
		Course.registerCourse2(new Applicent<Student>(new Student()));
		Course.registerCourse2(new Applicent<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicent<MiddleStudent>(new MiddleStudent()));

		
		System.out.println("-------------------------------");
		
		
		// 직장인과 일반인만 신청 가능 
		
		Course.registerCourse3(new Applicent<Person>(new Person()));
		Course.registerCourse3(new Applicent<Worker>(new Worker())); // worker와  worker의 부모 

		
	
	
	}

}

