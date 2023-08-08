class DriverProduct 
{
	public static void main(String[] args) 
	{
		Product p=new Mobile("Vivo","iq0006",9999,8);
		System.out.println(p.name);
		System.out.println(p.pid);
		System.out.println(p.price);
		Mobile m=(Mobile)p;
		System.out.println(m.ram);

		Product k=new PowerBank("Vivo","iq0006",9999,20000);
		System.out.println(p.name);
		System.out.println(p.pid);
		System.out.println(p.price);
		PowerBank n=(PowerBank)k;
		System.out.println(n.mah);

		Product j=new Shirt("Vivo","iq0006",9999,40);
		System.out.println(p.name);
		System.out.println(p.pid);
		System.out.println(p.price);
		Shirt o=(Shirt)j;
		System.out.println(o.size);
	}
}
