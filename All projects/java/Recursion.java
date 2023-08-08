class Recursion 
{
	public static void main(String[] args) 
	{
		//write a function that prints hello world
		//message(1);
		print(1);
	
	}
	/*static void message(int n)
	{
		System.out.println(n);
		message1(2);
	}
	static void message1(int n)
	{
		System.out.println(n);
		message2(3);
	}
	static void message2(int n)
	{
		System.out.println(n);
		message3(4);
	}
	static void message3(int n)
	{
		System.out.println(n);
		message4(5);
	}
	static void message4(int n)
	{
		System.out.println(n);
	} */
	static void print(int n)
	{
		if(n==5)
		{
			System.out.println(5);
			return;
		}
		System.out.println(n);
		print(n+1);
	}
}
