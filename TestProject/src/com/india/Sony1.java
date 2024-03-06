package com.india;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sony1 {

	public static void main(String[] args) {
		List<Integer> ll=Arrays.asList(10,5,6,5,3,7,5,7,10,4,12,5,12,3);
		System.out.println(ll.stream().filter(a->(Collections.frequency(ll, a))>1).collect(Collectors.toSet()));

	}

}
