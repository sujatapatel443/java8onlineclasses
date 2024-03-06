package com.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExamle {

	public static void main(String[] args) {
		
		List<Product> productList= new ArrayList();
		
		productList.add(new Product(11,"HP Laptop",30000));
		productList.add(new Product(12,"DELL Laptop",35000));
		productList.add(new Product(13,"LENOVO Laptop",25000));
		productList.add(new Product(11,"APPLE Laptop",50000));
		productList.add(new Product(11,"INTEL Laptop",30000));
		productList.add(new Product(11,"DELL THINKPAD Laptop",45000));
		
		List<Float> newList=productList.stream().filter(a->a.price>35000).map(p->p.price).collect(Collectors.toList());
		System.out.println(newList);
		
		
	}

}
 class Product {
	
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
