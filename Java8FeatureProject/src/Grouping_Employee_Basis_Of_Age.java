import java.util.stream.Collectors;

import com.java8.lambdaexpression.Employee;

public class Grouping_Employee_Basis_Of_Age {
	
	public static void main(String[] args) {
		Map<Integer,Employee> newMap=empList().stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.toMap(null, null)));

		newMap.entrySet().stream().forEach(e->{
		Map.Entry entry=(Map.Entry)e;
		System.out.println(entry.getValue().getName());
		});

		empList.stream().sorted((e1,e2)->{
		if(e1.getFirstName().equals(e2.getFirstName())){
		return e1.getLastName().compareTo(e2.getLastName());
		}else{
		  return e1.getFirstName().compareTo(e2.firstName());
		}


		});
		
		System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
	}

}
