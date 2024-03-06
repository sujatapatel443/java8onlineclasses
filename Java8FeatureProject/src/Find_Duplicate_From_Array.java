import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Duplicate_From_Array {

	public static void main(String[] args) {
		
int[] arr= {25,24,27,26,22,25,27};
	
Integer[] ar= {25,24,27,26,22,25,27};
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] ) {
					System.out.print(arr[j]+" ");
				}
					
			}
			
		}
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		List<Integer> list=Arrays.asList(ar);
		System.out.println(Collections.frequency(list, 25));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		list.stream().filter(a->Collections.frequency(list, a)>1).forEach(System.out::println);
		Set<Integer> set=list.stream().filter(a->Collections.frequency(list, a)>1).collect(Collectors.toSet());
		System.out.println(set);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		
		
		System.out.println("*********************************************");
		// 
		 // 1. list of Strings
        List<String> companies = new ArrayList<String>();
 
 
        // 1.1 add string elements to List
        companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple"); // duplicate
        companies.add("Meta"); //
		Set<String> duplicateCompanies = companies
                .stream()
                .filter(company -> Collections.frequency(companies, company) > 1)
                .collect(Collectors.toSet());
 
 
        // 3.1 print duplicate elements
        System.out.println("\n3. Duplicate elements : \n");
        duplicateCompanies.forEach(System.out::println);
		System.out.println("******************************************");
		System.out.println();
		
		String[] str= {"sujataPatel","raj","ravi","radhaAnushaKumar","rohan","raj","sujata"};
		List<String> l=Arrays.asList(str);
		l.stream().filter(e->e.getName.startsWith("A")).collect(Collectors.toList());
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.print(str[j]+" ");
				}
			}
		}
		
		System.out.println();
		System.out.println("1111111111111111111111111111111111");
		
		List<String> list1=Arrays.asList(str);
		
		Optional<String> longestString=list1.stream().reduce((str1,str2)->str1.length()>str2.length()?str1:str2);
		System.out.println(longestString.get());
		
		System.out.println("111111111111111111111111111111111111");
		
		
List<Integer> listt=Arrays.asList(ar);
		
		Optional<Integer> maxInteger = listt.stream().max(Integer::compare);
		System.out.println(maxInteger.get());
		
		Optional<Integer> minInteger = listt.stream().min(Integer::compare);
		
		System.out.println(minInteger.get());
		

	}

}
