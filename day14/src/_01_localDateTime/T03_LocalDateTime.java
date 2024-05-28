package _01_localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startDay = LocalDateTime.of(2024, 5, 7, 10, 0, 0); // 2024년 , 5월, 7일, 10시, 0분, 0초
		LocalDateTime endDay = LocalDateTime.of(2024, 11, 25, 18, 30, 0);
		
		System.out.println(startDay);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("");
		System.out.println("시작일 : " + startDay.format(dtf));
		System.out.println("종료일 : " + endDay.format(dtf));
		
		if(today.isBefore(startDay)) {
			System.out.println("수업 진행중 입니다.");
		} else if(today.isAfter(startDay)) {
			System.out.println("종료한 수업입니다.");
		} else if(today.isEqual(today)) {
			System.out.println("오늘 종료하는 날입니다.");
		}
		
		Duration duration = Duration.between(today, endDay); // 두 날짜 사이
		System.out.println(duration.getSeconds());
		
		System.out.println("종료일까지 시간 : " + today.until(endDay,ChronoUnit.DAYS) + "일 남음");
		System.out.println("종료일까지 시간 : " + today.until(endDay,ChronoUnit.MONTHS) + "개월 남음");
		System.out.println("종료 시간까지 시간 : " + today.until(endDay,ChronoUnit.HOURS) + "시간 남음");
		System.out.println("------------------------------");
		
		LocalTime endTime = LocalTime.of(18,30,0);
		
		System.out.println("종료시간까지 : " + LocalTime.now().until(endTime, ChronoUnit.HOURS) + "시간 남음");
		System.out.println("종료까지 : " + LocalTime.now().until(endTime, ChronoUnit.MINUTES) + "시간 남음");
		
		
		System.out.println("------------------------------");
		
		
		System.out.println(today.minusYears(3).format(dtf));
		System.out.println(today.minusMonths(5).format(dtf));
		System.out.println(today.minusDays(15).format(dtf));
		
		System.out.println("------------------------------");
	
		
		// withDayOfMonth() 변경하고 싶을때 with 을 씀 
		
	
		
		
	}

}
