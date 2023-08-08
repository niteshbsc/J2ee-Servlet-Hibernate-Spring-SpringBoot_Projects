import java.util.Scanner;
class  Big_Small
{
	static int isBig(int []arr){
		int big=arr[0];
		for(int i=0;i<arr.length;i++){
		if(arr[i]>big)
			big=arr[i];
		}
		return big;
	}
	static int isSmall(int []arr){
		int small=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<small)
				small=arr[i];
		}
		return small;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("User Entered values");
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]+" ");
	}
		
		System.out.println("Biggest element is"+isBig(arr));
		System.out.println("Smallest element is"+isSmall(arr));
	}
	
}
