
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test5 {

	public static void main(String[] args) {
		String str[]= {"RAJ","Varanasi","Hi","BLR","TamilnaduIndia"};
		
		List<String> lStr=new ArrayList<String>();
		for(String s:str) {
			lStr.add(s);
		}
		System.out.println(lStr.stream().max((a,b)->a.length()-b.length()).get());
		
		String[] stringArray = {"apple", "banana","TamilnaduIndia", "kiwi", "orange", "strawberry"};
		System.out.println(Arrays.stream(stringArray).max((a,b)->a.length()-b.length()).get());;
	}

}
