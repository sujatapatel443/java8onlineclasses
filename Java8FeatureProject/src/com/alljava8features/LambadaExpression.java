package com.alljava8features;


@FunctionalInterface
public interface LambadaExpression {
	
	void draw();

}

@FunctionalInterface
interface Shape{
	void draw();
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Shape draw() method");
		
	}
	
}


