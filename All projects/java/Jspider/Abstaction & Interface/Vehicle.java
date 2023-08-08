abstract class Vehicle  
{
	public abstract int getnoOfWheels();
}
class Bike extends Vehicle
{
	public int getnoOfWheels()
	{
		return 2;
	}
}

public static void main(String [] args)
{
	Vehicle v=new Vehicle();
	System.out.println(v.getnoOfWheels);
}