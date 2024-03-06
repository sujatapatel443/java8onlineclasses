package com.singleton;

public class MySingleton implements Cloneable{
	public static MySingleton instance;
	private MySingleton(){
		
	}
	
	public static MySingleton getMySingleton() {
		
		if(instance==null) {
			
			 synchronized(MySingleton.class) {
				 if(instance==null) {
					 
					 return new MySingleton();
				 }
			 }	
		}
			 return instance;
		}
		
	public Object clone() throws CloneNotSupportedException{
				throw new  CloneNotSupportedException();
				
			}
		
		
	
	

}
