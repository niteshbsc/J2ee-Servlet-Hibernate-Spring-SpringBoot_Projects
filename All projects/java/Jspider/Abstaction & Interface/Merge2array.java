

import java.util.Scanner;


public class Merge2array {
	int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter"+n+"values");
		for(int i=0;i<=ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public void dispArray(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+" ");
		}
		System.out.println();
	}
	public int[] merge(int[] a,int[] b) {
		int [] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge2array arr=new Merge2array();
		
//		System.out.println("Read first Array");
		int[] x=arr.readArray();
		arr.dispArray(x);
//		System.out.println("Read 2nd Array");
		int[] y=arr.readArray();
		arr.dispArray(y);
//		System.out.println("user entered first");
		
		
//		System.out.println("user entered second");
		
		
		
		int[] z=arr.merge(x,y);
//				System.out.println("After Merge");
				arr.dispArray(z);
	}

}
