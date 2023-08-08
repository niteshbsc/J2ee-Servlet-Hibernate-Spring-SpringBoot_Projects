class Calsi 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	public static boolean prime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
			}
		return true;	    
	}
	

	 public static int factorial(int f)
	{
		int fact=1;
		for(int i=1;i<=f;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static String evenorodd(int e)
	{
		if(e%2==0)
		{
		   return "even";
		}
		else
		{
			return "odd";
		}
	}
}

