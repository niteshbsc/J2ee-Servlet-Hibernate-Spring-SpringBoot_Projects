class DriverCar 
{
	public static void main(String[] args) 
	{
		Car c=new Xuv700();
		c.cc();
		c.color();
		c.noOfWheels();

		Xuv700 x=new Xuv700();
		c.cc();
		c.color();
	}
} 

abstract class Car
{
	public void noOfWheels()
	{
		System.out.println("4");
	}
	public abstract void cc();
	public abstract void color();
}
class Xuv700 extends Car
{
	public void cc()
	{
		System.out.println("1000");
	}
	public void color()
	{
		System.out.println("white");
	}
}
