
public class Method_Hiding {

	public static void main(String[] args) {
		
		
		
		Parent1.play();

		Child c=new Child();
		System.out.println(c.a);
		c.play();
		
		
		Parent1 p1=new Parent1();
		p1.play();
		System.out.println(p1.a);

	}

}
class Parent1 {

	int a = 10;

	static void play() {
		System.out.println("I am Parent play() method");
	}

}

class Child1 extends Parent{
	int a=15;
	void play() {
		System.out.println("I am child play() method");
	}
}
