package com.india;

import java.util.Arrays;

public class Testt {

	public static void main(String[] args) {
		 String[] str = {"laptop","mouse","keyboard","charger"};
		 System.out.println(Arrays.stream(str).sorted((a,b)->a.length()-b.length()).findFirst().get().length());
		 
		 Integer i[]= {10,6,9,5,4,8};
		 double average =  Arrays.stream(i).mapToDouble(Integer::doubleValue).average().orElse(0.0);
		 System.out.println(average);

	}

}
