package com.java8.lambdaexpression;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Collectors;
public class SortingOfListByLambdaExpression {
	public static void main(String[] args) {
		
		Collection<Employee1> empSet=new TreeSet<Employee1>(new SortingByName());
		empSet.add(new Employee1(11,"Sujata",65757798l,10000.00));
		empSet.add(new Employee1(16,"Sarita",657457798l,15000.00));
		empSet.add(new Employee1(10,"Baba",657577476l,18000.00));
		empSet.add(new Employee1(15,"Arv",65757798l,10000.00));
		
		
		System.out.println(empSet);
		
		Collection<Employee1> empSet2=new TreeSet<Employee1>();
		empSet2.add(new Employee1(11,"Sujata",65757798l,10000.00));
		empSet2.add(new Employee1(16,"Sarita",657457798l,15000.00));
		empSet2.add(new Employee1(10,"Baba",657577476l,18000.00));
		empSet2.add(new Employee1(15,"Arv",65757798l,10000.00));
		empSet2.add(new Employee1(13,"Divya",6575779845l,13000.00));
		
		Collection<Employee1> empSet3=empSet2.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		System.out.println(empSet3);
		
		Collection<Employee1> empSet4=empSet2.stream().sorted((e1,e2)->{
			
			return e2.getId()-e1.getId();
		}).collect(Collectors.toList());
		
		System.out.println(empSet4);
		
		/*Comparator<Employee1> sortingByName=(emp1,emp2)->emp2.getName().compareTo(emp1.getName());
		System.out.println(sortingByName);
*/
}
	
	
}
class SortingByName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Employee1 && o2 instanceof Employee1) {
			Employee1 e1=(Employee1)o1;
			Employee1 e2=(Employee1)o2;
			return e2.name.compareTo(e1.name);
		}
		return 0;
		
	}
	
}