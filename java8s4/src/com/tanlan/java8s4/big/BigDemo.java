package com.tanlan.java8s4.big;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDemo {

	public static void main(String[] args) {
		//float a=0x0123;
		System.out.println(0x23);
		//double a1=42e1;
		//BigDecimal bd = new BigDecimal(a1);  
		//System.out.println(new BigDecimal(a).toPlainString()); 
		//System.out.println(""+a);
		// long l=341298732472932434546;
		BigDecimal d1 = new BigDecimal("341298732472932434546");
		BigDecimal d3 = new BigDecimal("64653434354545");
		System.out.println(d1.add(d3));
		System.out.println(d1.subtract(d3));
		System.out.println(d1.multiply(d3));
		System.out.println(d1.divide(d3,d1.scale()));
		//System.out.println(d1.doubleValue());
		System.out.println(d1.toString());
		System.out.println(d1.toPlainString());
		
		BigDecimal d2 = new BigDecimal("12.36",new MathContext(3,RoundingMode.HALF_UP));
		System.out.println(d2.toPlainString());
		
		System.out.println("------------------");
		BigInteger i1=new BigInteger("12313123123213123123123");
		BigInteger i2=new BigInteger("12313123123213");
		System.out.println(i1.add(i2));
		
		BigDecimal d4=new BigDecimal("5.9",new MathContext(1, RoundingMode.DOWN));
		System.out.println(d4);
	}

}
