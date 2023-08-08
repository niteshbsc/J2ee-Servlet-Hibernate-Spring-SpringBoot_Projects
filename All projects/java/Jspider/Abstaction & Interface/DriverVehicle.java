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

class DriverVehicle
{
public static void main(String [] args)
{
	Bike b=new Bike();
	System.out.println(b.getnoOfWheels());
	Vehicle v=new Bike();
	System.out.println(v.getnoOfWheels());
}
}