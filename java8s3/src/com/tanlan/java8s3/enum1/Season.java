package com.tanlan.java8s3.enum1;

public enum Season {
	SPRING("spring"){

		@Override
		public void m2() {
			
		}
	
	}, SUMMER("summer"){

		@Override
		public void m2() {
			// TODO Auto-generated method stub
			
		}
		
		
	}, AUTUMN("autumn"){

		@Override
		public void m2() {
			// TODO Auto-generated method stub
			
		}
		
	}, WINTER("winter"){

		@Override
		public void m2() {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	String name;
	
	private Season(String name){
		this.name=name;
		System.out.println("Season");
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void m2();
}
