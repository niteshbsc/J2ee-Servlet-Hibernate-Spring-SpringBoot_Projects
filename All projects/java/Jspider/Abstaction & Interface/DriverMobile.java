class  DriverMobile
{
	public static void main(String[] args) 
	{
		Mobile m=new Vivo();
		m.ram();
		m.color();
		
		Vivo v=new Vivo();
		m.ram();
		m.color();
	}
}

 abstract class Mobile
{
	abstract public void ram();
	abstract public void color();
}
class Vivo extends Mobile
{
	public void ram()
	{
		System.out.println("6gb!");
	}
	public void color()
	{
		System.out.println("green");
	}
}