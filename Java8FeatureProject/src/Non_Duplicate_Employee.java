import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Non_Duplicate_Employee {

	public static void main(String[] args) {

		List<Employee>  emps = new ArrayList();
		Employee e1 = new Employee(1L, "samar","sahoo");
		Employee e2 = new Employee(2L, "samar","sahoo");
		Employee e3 = new Employee(3L, "varsha","patra");
		emps.add(e1);emps.add(e2);emps.add(e3);

		//Write the program to remove the duplicate employee objects for which first and last name are same.

		Set<Employee> NonDulicateEmp=emps.stream().collect(Collectors.toSet());
		System.out.println(NonDulicateEmp);
		
		List<Employee> NonDulicateEmp1=emps.stream().distinct().collect(Collectors.toList());
		System.out.println(NonDulicateEmp1);

	}

}

class Employee {
	  private Long id;
	  private String firstName;
	  private String lastName;
	  
	  Employee(Long id,String firstName,String lastName){
		  this.id=id;
		  this.firstName=firstName;
		  this.lastName=lastName;
	  }
	  
	 public int hashCode(){
	  
	  return this.firstName.length()+this.lastName.length();
	  }
	  
	 public boolean equals(Object obj){
		 
		 Employee e=(Employee)obj;
	  return this.firstName.equals(e.firstName)&&this.lastName.equals(e.lastName);
	  }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	 
	 
	  
}