import java.util.Scanner;
class MiddleOfThree 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first no.:");
		int a=sc.nextInt();
		System.out.println("Enter a second no.:");
		int b=sc.nextInt();
		System.out.println("Enter a Third no:");
		int c=sc.nextInt();
		if(b>a && a>c || c>a && a>b )
		{
			System.out.println(a+ "is a middle no.");
		}
		if(a>b && b>c || c>b && b>a)
		{
			System.out.println(b+ "is the middle no.");
		}
		if(a>c && c>b || b>c && c>a)
		{
			System.out.println(c+ "is the middle no.");
		}
	}
}
