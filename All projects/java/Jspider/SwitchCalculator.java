class SwitchCalculator 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=5;
		//int res;
		char operator='+'; //or (-,*,%,/)

		switch (operator)
		{
			case '+':
				//res=a+b;
				System.out.println(a+b);
			break;
			case '-':
				//res=a-b;
				System.out.println(a-b);
			break;
			case '*':
				//res=a*b;
				System.out.println(a*b);
			break;
			case '/':
				//res=a/b;
				System.out.println(a/b);
			break;
			case '%':
				//res=a%b;
				System.out.println(a%b);
			break;
			default:
				System.out.println("Enter valid key");
			
		}

	}
}
