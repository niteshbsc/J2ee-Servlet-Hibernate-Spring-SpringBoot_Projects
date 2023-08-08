class DriverVehicle 
{
	public static void main(String[] args) 
	{
		Bike b=new Bike("Bullet","Classic500",200000,500);
		System.out.println(b.name);
		System.out.println(b.model);
		System.out.println(b.price);
		System.out.println(b.cc);
	}
}
