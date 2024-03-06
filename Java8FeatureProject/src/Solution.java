import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 
 
abstract class OnlineAccount { 
	int basePrice = 120; 
	int regularMoviePrice = 45; 
	int exclusiveMoviePrice = 80; 
} 
 
class Account extends OnlineAccount implements Comparable<Account> { 
	int noOfRegularMovies, noOfExclusiveMovies; 
	String ownerName; 
 
	public Account(String owner, int regMovies, int exclMovies) { 
		this.ownerName = owner; 
		this.regularMoviePrice = regMovies; 
		this.exclusiveMoviePrice = exclMovies; 
	} 
 
	public int monthlyCost() { 
		return basePrice + noOfRegularMovies * regularMoviePrice + noOfExclusiveMovies * exclusiveMoviePrice; 
	} 
 
	@Override 
	public int compareTo(Account o) { 
		if(this.monthlyCost()>(o.monthlyCost())) { 
			return 1; 
		} else { 
			return -1; 
		} 
	} 
 
	public String toString() { 
		return "Owner is " + ownerName + " and monthly cost is " + this.monthlyCost() + " USD."; 
	} 
} 
 
public class Solution { 
	public static void main(String [] args) { 
		Scanner sc = new Scanner(System.in); 
		String sub = sc.nextLine(); 
 
		int t = Integer.parseInt(sub); 
		ArrayList<Account> list = new ArrayList <>(); 
		for(int i=0; i < t; i++) { 
			String[] input = sc.nextLine().split(""); 
			list.add(new Account(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]))); 
		} 
 
		Collections.sort(list); 
		System.out.println("Most valuable account details:"); 
		System.out.println(list.get(list.size()-1)); 
	} 
} 