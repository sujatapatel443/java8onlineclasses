package com.alljava8features;

public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		
		Thread thread=new Thread(new ThreadDemo());
		thread.start();
		
		//Runnable runnable=()->System.out.println("Runnable run() method using lambda....");
		
		Thread t=new Thread(()->System.out.println("Runnable run() method using lambda...."));
		t.start();
	}

}

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable run() method called....");
		
	}
	
	
	
}
