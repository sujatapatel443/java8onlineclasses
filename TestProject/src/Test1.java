import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {

		
		List<String> lstr=new ArrayList<String>();
		lstr.add("Raj");
		lstr.add("Kumar");
		lstr.add("Raj");
		lstr.add("Patel");
		lstr.add("Raj");
		lstr.add("Kumar");
		
		Map<String,Long> m=lstr.stream().collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
		System.out.println(m);
		
		List<Emp> eLIST=new ArrayList<Emp>();
		eLIST.add(new Emp("RAJ",10000L,101));eLIST.add(new Emp("KUMAR",9000L,301));eLIST.add(new Emp("HANUMANTA",45000L,201));
		eLIST.add(new Emp("PATEL",15000L,401));eLIST.add(new Emp("RAJ",8000L,601));
		System.out.println(eLIST.stream().filter(e->e.getSal()>9000).map(Emp::getName).collect(Collectors.toList()));
		
		System.out.println(eLIST.stream().sorted(Comparator.comparing(Emp::getName).
				thenComparing(Emp::getSal)).collect(Collectors.toList()));
		
	}

}

class Emp{
	String name;
	Long sal;
	int eid;
	public Emp(String name, Long sal, int eid) {
		super();
		this.name = name;
		this.sal = sal;
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSal() {
		return sal;
	}
	public void setSal(Long sal) {
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + ", eid=" + eid + "]";
	}
	
	
}
