package com.sp.program;

public class MySingleton {
	
	private static MySingleton instance;
	
	private MySingleton() {
		
	}
	public static MySingleton getMySingleton() {
		if(instance==null) {
			synchronized (MySingleton.class) {
				if(instance==null) {
					return new MySingleton();
				}
				
			}
		}
		return instance;
	}
	
	

}
