
public class InheritanceProgram {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		System.out.println(p.a);
		p.play();

		Child c=new Child();
		System.out.println(c.a);
		c.play();
		System.out.println(p.a);
		
		Parent p1=new Child();
		p1.play();
		System.out.println(p1.a);

	}

}

class Parent {

	int a = 10;

	 void play() {
		System.out.println("I am Parent play() method");
	}

}

class Child extends Parent{
	int a=15;
	void play() {
		System.out.println("I am child play() method");
	}
}
