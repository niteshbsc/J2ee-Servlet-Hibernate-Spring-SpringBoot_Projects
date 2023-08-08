import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		/*
		String str, reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+str.charAt(i);
		if(str.equals(reverse))
		{
			System.out.println("Entered string is palindrome");
		}
		else
		{
			System.out.println("Entered string is not palindrome");
		}
	}
}  */

//Another way

int r,sum=0,temp;
int n=121;
temp=n;
while(n>0)
{
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
}
if(temp==sum)
System.out.println("Palindrome number");
else
System.out.println("not Palindrome");
}
}