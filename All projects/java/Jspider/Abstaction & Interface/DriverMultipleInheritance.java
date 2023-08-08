class DriverMultipleInheritance 
{
	public static void main(String[] args) 
	{
		Abc n=new Abc();
		n.m1();

		I1 i=new Abc();
		i.m1();
		I2 in=new Abc();
		in.m1();
	}
}
interface I1
{
	void m1();
}
interface I2
{
	void m1();
}
class Abc implements I1,I2
{
	public void m1()
	{
		System.out.println("M1 method from class Nitesh");
	}
}