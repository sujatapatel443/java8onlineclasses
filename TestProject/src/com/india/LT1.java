package com.india;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LT1 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(5,8,19);
		
		System.out.println(l.stream().min(Comparator.comparingInt(Integer::intValue)).get());
		System.out.println(l.stream().max(Comparator.comparingInt(Integer::intValue)).get());

	}

}
