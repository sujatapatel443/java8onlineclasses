import java.util.ArrayList;
import java.util.List;

public class IndexofFirstandLastOccrnce {

	public static void main(String[] args) {
		
		int a[]= {3,2,4,2,6,2,8,3,2,5};
		List list=new ArrayList();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==2) {
				System.out.print(i+" ");
				System.out.println();
				list.add(i);
			}
		}
		System.out.print(list+" ");
		int m=0,n=0;int count=0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == 2) {
				count++;
				if(count==1) {
					m=i;
				}
				n=i;
				
			}
		}

		System.out.println(m+"\t"+n);
		System.out.println("***************");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				if((a[i]+a[j])%2==0 && i<j) {
					System.out.println(i+"\t"+j);
				}
			}
		}

	}

}
