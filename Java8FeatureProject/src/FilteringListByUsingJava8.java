import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilteringListByUsingJava8 {

	public static void main(String[] args) {

List<String> obj = Arrays.asList("Aman" , "Arnab" , "Bap");

             

              Map<String, List<String>> generatedMap =obj.stream().filter(c->c.startsWith("A"))

                           .map(n-> "A"+n).map(j-> j.split("A",2)).

              collect(Collectors.groupingBy(m->m[0]+"A",Collectors.mapping(k-> k[1],Collectors.toList())));

 

              System.out.println(generatedMap);

	}

}
