package _04_Enum;

import java.util.*;

public class T01_EnumWeek {

	public static void main(String[] args) {
		
		/*			 Week 일때
					Week today = null;
					
					Calendar cal = Calendar.getInstance();
					cal.get(cal.DAY_OF_WEEK);
					
					// 요일 1~7
					int week = cal.get(cal.DAY_OF_WEEK);
					System.out.println(week);
					
					
					switch(week) {
					case 1: today = Week.SUNDAY; break;			
					case 2: today = Week.MONDAY; break;			
					case 3: today = Week.TUESDAY; break;			
					case 4: today = Week.WEDNESDAY; break;			
					case 5: today = Week.THURSDAY; break;			
					case 6: today = Week.FRIDAY; break;				
					case 7: today = Week.SATURDAY;
						
					
					if ( today == Week.SUNDAY)
						System.out.println(" 금요일엔 수업 끝나고 쉬어도 대");
					else
						System.out.println("열심히 자바공부를 한다");
				*/
		
		// Month일때
		// 달 0~11
		Month today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int month = cal.get(cal.DAY_OF_MONTH);
		
		System.out.println(month);
		
		switch(month) {
		case 0: today = Month.JANUARY; break;			
		case 1: today = Month.FEBRUARY; break;			
		case 2: today = Month.MARCH; break;			
		case 3: today = Month.APRIL; break;			
		case 4: today = Month.MAY; break;			
		case 5: today = Month.JUNE; break;				
		case 6: today = Month.JULY; break;		
		case 7: today = Month.AUGUST; break;	
		case 8: today = Month.SEPTEMBER; break;	
		case 9: today = Month.OCTOBER; break;	
		case 10: today = Month.NOVEMBER; break;	
		case 11: today = Month.DECEMBER; 
		
		
		}
		
		if ( today == Month.MAY)
			System.out.println("5월은 너무너무 좋은날 ");
		else
			System.out.println("열심히 자바공부를 한다");
		
			
		
	}

}
