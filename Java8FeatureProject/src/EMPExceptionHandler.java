
public class EMPExceptionHandler {

	public static void main(String[] args) {
		show(5);

	}
	
  static void show(int i) {
	  
	 System.out.println("Before Exception");
	 
	 if(i==5) {
	 throw new EMPNotFoundException(i);
	 }
	
	System.out.println("After Exception");
  }

}
