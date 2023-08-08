
//using flag variable

class PrimeCheck{
	/*
public static void main(String[] args){
int i, m=0,flag=0;
int n=5;
m=n/2; 
if(n==0||n==1){
System.out.println(n+"is not a prime number");
}
else{
for(i=2;i<=m;i++){
if(n%i==0){
System.out.println(n+"is not a prime no.");
flag=1;
break;
}
}
if(flag==0){
System.out.println(n+ "is a prime number");
}
}
}
} *

//Using function

/*class PrimeCheck{
static void check(int n){
int i, m=0,flag=0;
m=n/2; 
if(n==0||n==1){
System.out.println(n+"is not a prime number");
}
else{
for(i=2;i<=m;i++){
if(n%i==0){
System.out.println(n+"is not a prime no.");
flag=1;
break;
}
}
if(flag==0){
System.out.println(n+ "is a prime number");
}
}
}
public static void main(String[] args){
check(2);
check(3);
check(155);
check(97);
}
}  */

//using scanner class

/* import java.util.Scanner;
class PrimeCheck
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(isPrime(n))
		{
			System.out.println(n+ " is prime");
		}
		else
		{
			System.out.println(n+" is not prime");
		}
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
} */



   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}