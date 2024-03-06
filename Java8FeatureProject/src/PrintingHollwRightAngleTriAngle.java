
public class PrintingHollwRightAngleTriAngle {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j || i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		System.out.println("***************");
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j || i==n) {
					
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
