class Sim 
{
	long simno;
	private String serviceProvider;
	private double balance;
	Sim(long simno, String serviceProvider, double balance)
	{
		this.simno=simno;
		this.serviceProvider=serviceProvider;
		this.balance=balance;
	}
	public String getserviceProvider()
	{
		return serviceProvider;
	}
	public void setserviceProvider(String serviceProvider)
	{
		this.serviceProvider=serviceProvider;
	}
	public double getbalance()
	{
		return balance;
	}
	public void setbalance(double balance)
	{
		this.balance= balance;
	}

	public static void main(String[] args) 
	{
		Sim s1=new Sim(7004717,"JIO",777);
		System.out.println(s1.simno);
		System.out.println(s1.getserviceProvider());
		System.out.println(s1.getbalance());
		s1.setserviceProvider("Airtel");
		System.out.println(s1.getserviceProvider());
	}
}
