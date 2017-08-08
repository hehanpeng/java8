package com.tanlan.java8s3.thread;

public class ProductorThread implements Runnable {
	private Resource resource;

	public ProductorThread(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.increse();
		}
	}

}
