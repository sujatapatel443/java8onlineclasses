package com.java8.streaprograming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentGraceMarks {
	static int  c=6;
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(85);
		list.add(78);
		list.add(92);
		list.add(81);
		list.add(65);
		list.add(76);
		
		System.out.println("Initial marks of Students :"+list);
		
		List<Integer> newlistwithincreasedMarks=list.stream().map(a->a+6).collect(Collectors.toList());
		System.out.println("After grace marks of Students");
		System.out.println(newlistwithincreasedMarks);
		
		List<Integer>listForMoreThanNinty=newlistwithincreasedMarks.stream().filter(a->a>90).collect(Collectors.toList());
		System.out.println(listForMoreThanNinty);
		
		Integer MaxMarksInList=newlistwithincreasedMarks.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println(MaxMarksInList);
		
		Integer MinMarksInList=newlistwithincreasedMarks.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(MinMarksInList);
		
		
		Integer updatedmarks= newlistwithincreasedMarks.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("**************");
		Optional<Integer>StudentHighestGraceMarks=newlistwithincreasedMarks.stream().sorted((a,b)->b-a).distinct().findFirst();
		System.out.println(StudentHighestGraceMarks.get());
		System.out.println("*****************");
		
		Optional<Integer>StudentMinGraceMarks=newlistwithincreasedMarks.stream().sorted((a,b)->a-b).distinct().findFirst();
		System.out.println(StudentMinGraceMarks.get());
		
		System.out.println(updatedmarks);
		
		String str="SujataPatel";
		String occ="";
		String[] str1=str.split(" ");
		
		for(int i=0;i<str1.length;i++) {
			
				
			
		}
		
		
	
	}
	

}


