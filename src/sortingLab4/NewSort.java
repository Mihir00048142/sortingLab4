package sortingLab4;
import java.util.*;
public class NewSort {
	public void sort(int a[],int x) {
		int j;
		for(int i=0;i<x;i++) {
			for(j=0;j<x-1;j++) {
				if(a[j]>a[j+1]) {
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter limits");
	 int x=sc.nextInt();
	 int a []=new int[x];
	 for(int i=0;i<x;i++) {
		 a[i]=sc.nextInt();
	 }
	 NewSort o=new NewSort();
	 o.sort(a, x);
	 for(int i=0;i<x;i++) {
		 System.out.print(a[i]+" ");
	 }
 }
}
