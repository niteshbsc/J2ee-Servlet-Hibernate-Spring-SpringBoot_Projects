class DriverFruits 
{
	public static void main(String[] args) 
	{
		Fruits j=new Apples("Apples","Yellow","Kolkata");
		Fruits f=new Mango("Apples","Yellow",40);
		System.out.println(f.name);
		System.out.println(f.color);
		Mango m=(Mango)f;
		System.out.println(m.weight);
		Apples a=(Apples)j;
		System.out.println(a.origin);
	}
}
