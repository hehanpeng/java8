package com.tanlan.java8s3.gc;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

class BigObject{
	private long[] nums=new long[4096];
	
	private long id;
	public BigObject(long id) {
		this.id=id;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(id+"被回收");
	}
}

public class SoftRefDemo {

	public static void main(String[] args) {
		BigObject b1=new BigObject(0);
		SoftReference<BigObject> sr=new SoftReference<>(b1);
		b1=null;
		
		List<BigObject> list=new ArrayList<>();
		long i=1;
		while(true){
			list.add(new BigObject(i++));
		}
	}

}
