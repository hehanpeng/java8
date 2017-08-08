package com.tanlan.java8s4.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLContentDemo {

	public static void main(String[] args) throws Exception {
		getContent1();
	}

	/**
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public static void getContent() throws MalformedURLException, IOException {
		URL url = new URL("http://www.baidu.com");
		InputStream is = url.openStream();
		BufferedReader r=new BufferedReader(new InputStreamReader(is));
		String s=null;
		while((s=r.readLine())!=null){
			System.out.println(s);
		}
		r.close();
	}
	
	static void getContent1() throws Exception{
		URL url = new URL("http://www.baidu.com");
		Class[] c=new Class[]{String.class,BufferedReader.class,InputStream.class};
		Object o=url.getContent(c);
		if(o instanceof String){
			System.out.println(o);
		}else if(o instanceof BufferedReader){
			System.out.println("BufferedReader");
		}else if(o instanceof InputStream){
			System.out.println("InputStream");
			System.out.println(o);
		}else{
			System.out.println("else");
		}
	}
	
	static void getContent2() throws Exception{
		URL url = new URL("http://www.baidu.com");
		URLConnection c=url.openConnection();
		c.setDoOutput(true);
		c.connect();
		InputStream is =c.getInputStream();
		OutputStream os=c.getOutputStream();
	}

}
