package com.india;

import java.util.*;
import java.util.stream.Collectors;

public class Add1InEven {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,5,6,7,9);
		
		List<Integer> l1=l.stream().map(e->e%2==0?e=e+1:e).collect(Collectors.toList());
	
		System.out.println(l1);
	}

}
