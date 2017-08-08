package com.tanlan.java8s4.compare;

public class CompareDemo1 {
	public static void main(String[] args) {
		User u1=new User();
		u1.age=10;
		
		User u2=new User();
		u2.age=20;
		
		if(u1.compareTo(u2)>0){
			System.out.println("u1>u2");
		}else if(u1.compareTo(u2)<0){
			System.out.println("u1<u2");
		}else{
			System.out.println("u1==u2");
		}
		
	}
}
