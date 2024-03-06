package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TTT {

	public static void main(String[] args) {
		
		Map<Integer, String> hashmap = new LinkedHashMap<>();
        hashmap.put(22, "A");
        hashmap.put(55, "B");
        hashmap.put(33, "Z");
        hashmap.put(44, "M");
        hashmap.put(99, "I");
        hashmap.put(88, "X");

        Map<Integer, String> sortedMap = hashmap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Original Map: " + hashmap);
        System.out.println("Sorted Map by values: " + sortedMap);
	}

}
