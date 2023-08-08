class CarNonStatic 
{
	String brand;
	String color;
	long cc;
	public void details()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(cc);
	}
	public static void main(String[] args) 
	{
		Car s1=new Car();
		s1.brand="Bmwcar";
		s1.color="black";	
		s1.cc=1500;
		Car s2=new Car();
		s2.brand="Hundai";
		s2.color="white";	
		s2.cc=2000;
		s1.details();
		s2.details();
	}
}
