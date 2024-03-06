package com.java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySorting {

	public static void main(String[] args) {
		
		
		Integer array []= {5,1,10,11,4,3,6,7,4,2,2,8,9,12};
		
		List<Integer> list=Arrays.asList(array);
		
		List<Integer> sortedList=list.stream().sorted((a,b)->a-b).distinct().collect(Collectors.toList());
		
		System.out.print(sortedList);

		
		list.stream().filter(a->a > 5).forEach(System.out::println);

	}

}
