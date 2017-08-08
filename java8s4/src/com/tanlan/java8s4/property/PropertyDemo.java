package com.tanlan.java8s4.property;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		p.load(new FileInputStream("config.properties"));
		//p.forEach((n,v)->System.out.println(n+"="+v));
		//System.out.println(p.get("name"));
		p.setProperty("name", "Jack");
		p.setProperty("newp", "newv");
		p.store(new FileOutputStream("config.properties"), "");
		
		
		Properties sp=System.getProperties();
		sp.forEach((n,v)->System.out.println(n+"="+v));
	}

}
