import java.util.Scanner;
class Merge 
{
	int[] merging(int[] a,int[]b){
		int []c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++){
			c[a.length+i]=b[i];
		}
		return c;
	}

	int[] readArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	void dispArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Merge m=new Merge();
		int x[]=m.readArray();
		m.dispArray(x);
		int y[]=m.readArray();
		m.dispArray(y);

		int z[]=m.merging(x,y);
		m.dispArray(z);
	}
}
