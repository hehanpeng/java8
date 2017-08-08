package com.tanlan.java8s4.nio;

import java.nio.ByteBuffer;

public class BufferDemo {

	public static void main(String[] args) {
		byte[] b=new byte[10];
		ByteBuffer b1 = ByteBuffer.allocate(10);
		ByteBuffer b2 = ByteBuffer.wrap(new byte[] { 1, 2, 3 });
		//ByteBuffer b3 = ByteBuffer.allocateDirect(10);
		int limit=b1.limit();
		for(int i=0;i<limit;i++){
			b1.put(i,(byte)i);
		}
		
		
		
		
		System.out.println(limit);
		for(int i=0;i<limit;i++){
			System.out.print(b1.position()+":");
			System.out.println(b1.get(i));
		}
		
	}

}
