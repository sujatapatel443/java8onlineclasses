package com.java8.lambdaexpression;

public class DrawableClient {

	public static void main(String[] args) {
		
		int a=20;
		//Implementation  of functionalinterface by anonymous class
		Drawable dr = new Drawable() {

			@Override
			public void draw() {
				System.out.println("draw() method of drawable :"+a);
			}
			
		};
		dr.draw();
		
		//Implementation  of functionalinterface by LambdaExrpession
		Drawable d = ()->{
			System.out.println("draw() method of drawable :"+a);
		};
		d.draw();

	}

}
