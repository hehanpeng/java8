package com.tanlan.java8s4.time;

import java.util.Calendar;
import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());
		
		Date d1=new Date();
		d1.setTime(1418042471366L);
		
		System.out.println(d.after(d1));
		
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
		c.get(Calendar.DATE));
		c.add(Calendar.YEAR, -7);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
				c.get(Calendar.DATE));
		c.roll(Calendar.DATE, 30);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
				c.get(Calendar.DATE));
		c.roll(Calendar.DATE, false);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
				c.get(Calendar.DATE));
		//System.out.println(c.get(Calendar.MONTH)+1);
		
		
	}

}
