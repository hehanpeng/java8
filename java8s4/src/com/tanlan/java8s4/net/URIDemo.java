package com.tanlan.java8s4.net;

import java.net.URI;
import java.net.URISyntaxException;

public class URIDemo {

	public static void main(String[] args) throws Exception {
		URI uri1=new URI("https://www.baidu.com/s?wd=Java&rsv_spt=1&issp=1&f=3&rsv_bp=0&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=0&rsv_sug3=6&rsv_sug1=2&rsp=0&inputT=4310&rsv_sug4=12003");
		
		URI uri2=URI.create("http://www.baidu.com");
		
		System.out.println(uri1.getScheme());
		System.out.println(uri1.getHost());
		System.out.println(uri1.getPort());
		System.out.println(uri1.getPath());
		System.out.println(uri1.getQuery());
		
		URI uri3=new URI("index.jsp");
		System.out.println(uri1.resolve(uri3));
	}

}
