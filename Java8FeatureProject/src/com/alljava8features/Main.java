package com.alljava8features;

public class Main {

	public static void main(String[] args) {
		
		LambadaExpression ref=()->{
			System.out.println("LambadaExpression draw() method");
		};
		
		ref.draw();
		
		Shape ref1=()->{
			System.out.println("Shape draw() method");
		};
		
		//ref1.draw();
		
		Main.print(ref1);

}
	
	private static void print(Shape shape) {
	shape.draw();	
	}
}