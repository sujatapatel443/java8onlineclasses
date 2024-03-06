package com.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeDemoUsingJava8 {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		Map<String, Long> noOfMaleAndFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemale);

		/* // Print the name of all Department in the organization
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		// what is the average age of male and female employee
		Map<String, Double> averageAgeOfMaleAndFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		System.out.println(averageAgeOfMaleAndFemale);

		// get details of highest paid employee in the department
		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(highestPaidEmployeeWrapper);

		// get the name of all employee who have join after 2015
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);

		// count the number of employee in each deaprtment
		Map<String, Long> noOfEmployeeInEachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(noOfEmployeeInEachDepartment);

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::print);

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::print);

		// Map<String,Long> lsit=
		// employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

		// System.out.println(lsit);

		Map<String, Long> genderOfMaleAndFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(genderOfMaleAndFemale);

		Optional<Employee> highestSalary = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(highestSalary.get());

		Optional<Employee> HighestSal = employeeList.stream().sorted((a, b) -> (int) (b.getSalary() - a.getSalary()))
				.distinct().findFirst();

		System.out.println(HighestSal.get());

		// Optional<Employee>HighestSal=
		// employeeList.stream().sorted((a,b)->a.getSalary()-b.getSalary())

		Map<String, Long> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::print);

		Map<String, Double> averageAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		Optional<Employee> maxSalaryprerson = employeeList.stream()
				.sorted((a, b) -> (int) (b.getSalary() - a.getSalary())).distinct().findFirst();

		System.out.println(maxSalaryprerson.get());

		employeeList.stream().filter(a -> a.getYearOfJoining() < 2015).forEach(System.out::print);
		System.out.println();

		System.out.println("***************");

		Optional<Employee> lowestPaidEmp = employeeList.stream().sorted((a, b) -> (int) (a.getSalary() - b.getSalary()))
				.distinct().findFirst();

		System.out.println(lowestPaidEmp.get());

		// get the name of all employee who has joined after 2017

		List<Employee> listOfEmpJoinAftertoonesevsn = employeeList.stream().filter(a -> a.getYearOfJoining() > 2017)
				.collect(Collectors.toList());

		System.out.println(listOfEmpJoinAftertoonesevsn);
		Optional<Employee>highlyExperiencedEmp=employeeList.stream().sorted((a,b)->a.getYearOfJoining()-b.getYearOfJoining()).distinct().findFirst();
		
		System.out.println(highlyExperiencedEmp.get());
		*/
		//get highest salary from all department
		Map<Double,Optional<Employee>>highestSalaryFromEachDepartment=employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.maxBy
				(Comparator.comparingDouble(Employee::getSalary))));
		
		//System.out.println(highestSalaryFromEachDepartment);
		Comparator com=(o1,o2)->{
			Employee e1=(Employee)o1;
			Employee e2=(Employee)o2;
			return (int)(e1.getSalary() - e2.getSalary());
		};
		System.out.println();
		Map<String,Double>highestSalaryFromEachDepartment1=employeeList.stream().collect(Collectors.groupingBy
				(Employee::getDepartment,Collectors.maxBy(com)));
		
		Set set=highestSalaryFromEachDepartment1.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
		
	}

}
