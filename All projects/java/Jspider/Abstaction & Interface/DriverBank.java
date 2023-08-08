class DriverBank 
{
	public static void main(String[] args) 
	{
		Sbi s=new Sbi();
		s.withdraw();
		s.balanceinquiry();
		s.deposite();

		Bank b=new Sbi();
		b.withdraw();
		b.balanceinquiry();
		b.deposite();
	}
}

interface Bank
{
	void withdraw();
	void balanceinquiry();
	void deposite();
}
class Sbi implements Bank
{
	public void withdraw()
	{
	System.out.println("5000");	
	}
	public void balanceinquiry()
	{
	System.out.println("100000");	
	}
	public void deposite()
	{
	System.out.println("4000");	
	}
}