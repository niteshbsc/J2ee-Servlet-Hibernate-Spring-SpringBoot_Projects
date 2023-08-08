class DriverInterface 
{
	public static void main(String[] args) 
	{
		C c=new C();
		c.m1();
		 
		 I1 i=new C();
		 c.m1();
	}
}

interface I1
{
	void m1();
}
class C implements I1
{
    public void m1()
	{
		System.out.println("overriden");
	}
}