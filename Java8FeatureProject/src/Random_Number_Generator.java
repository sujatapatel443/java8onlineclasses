import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
public class Random_Number_Generator {

	public static void main(String[] args) {
		Random random=new Random();
		int num1=0;
		
		
		 num1=random.nextInt(6)+1;
		System.out.println("Random nuber is : "+num1);
		
		int firstInteger=ThreadLocalRandom.current().nextInt();
		int SecondInteger=ThreadLocalRandom.current().nextInt();
		
		System.out.println(firstInteger);
		System.out.println(SecondInteger);
		
		IntStream ints=random.ints(10,0,50);
		
		//ints.forEach(number->System.out.println+(number));
		

	}

}
