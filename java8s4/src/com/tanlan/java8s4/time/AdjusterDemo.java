package com.tanlan.java8s4.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;

public class AdjusterDemo {

	public static void main(String[] args) {
		String s1="Hello ";         
		String s2="Java!!";     
		String s4=s1+s2;        
		String s3="Hello Java!!";        
		//System.out.println(s4); //         
		//System.out.println(s3); //    
		System.out.println(s1+s2);
		System.out.println(s3);
		System.out.println(("Hello "+"Java!!")==s3); //    

		System.out.println(s3==s4); 
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate d = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(d);

		LocalDate d2 = now.with(TemporalAdjusters.dayOfWeekInMonth(6,
				DayOfWeek.TUESDAY));
		System.out.println(d2);

		TemporalAdjuster adjuster = TemporalAdjusters.ofDateAdjuster((
				LocalDate date) -> date.plusMonths(3).plusDays(2));
		System.out.println(d.with(adjuster));

		TemporalQuery<LocalDate> d5 = TemporalQueries.localDate();
		System.out.println(now.query(d5));

		TemporalQuery<TemporalUnit> d6=TemporalQueries.precision();
		LocalTime nowTime=LocalTime.now();
		System.out.println(nowTime.query(d6));
	}

}
