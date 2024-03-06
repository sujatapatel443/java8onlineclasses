
 /*The number 39 will reduce as
   Step 1 :(39 → 3x9 = 27) →
   Step 2 : (27 → 2x7 =  14) →
   Step 3 : (14 → 1x4 = 4)
     */

public class Test5 {

	public static void main(String[] args) {
		int num=395;
        int mulResult=1;
        
        while(num>9) {
        	
        	while(num>0) {
            	int r=num%10;
            	num=num/10;
            	mulResult=mulResult*r;
            	
            }
        	System.out.println(mulResult);
        	num=mulResult;
        	mulResult=1;
        }

	}

}
