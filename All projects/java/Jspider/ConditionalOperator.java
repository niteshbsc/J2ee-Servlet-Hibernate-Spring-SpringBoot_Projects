class ConditionalOperator 
{
	public static void main(String[] args) 
	{
		int num=9;
		String res=num%2==0?"Even":"Odd"; 
		System.out.println(res);


		//wap to identify greatest of two numbers

		int x=10;
		int y=20;
		int result=(x>y?x:y);
		System.out.println(result);

		//wap to check whether 15 is divisible ny 3 and 5 or not...

		int num1=15;
		String res1=(num1%3==0?"yes":"No");
		String res2=num1%5==0?"yes":"No";

		System.out.println(res1);
		System.out.println(res2);

	}
}

