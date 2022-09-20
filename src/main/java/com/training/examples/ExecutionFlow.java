package com.training.examples;

public class ExecutionFlow {
	
	
	static int id=0;
	 int num = 0;
	
	static {
		//System.out.println(" i am from static block");// first priority
	}
	
	{
		//System.out.println(" I am from instance block"+id); 
	}
	
	public ExecutionFlow() {
		super();
		//System.out.println("I am from constructor"+num);
	}
	
	
	public static void main(String args[]) {
		Vehicle v1= new Vehicle() {
			public void move(int a,int b) {
				System.out.println(a+b);
			}
		};
		v1.move(25, 15);
		
		//java 8 feature
		Vehicle v= (s,t)->{
			int c= s+t;
			System.out.println(c);
			};
		v.move(10,15);
		
	}
	
	

}
