class Encapsulation 
{
	String name;
	private String gfName;
	public Encapsulation(String name, String gfName)
	{
		this.name=name;
		this.gfName=gfName;
	}
	public String getGfName()
	{
		return gfName;
	}
	public void setGfName(String gfName)
	{
		this.gfName=gfName;
	}
	public static void main(String[] args) 
	{
		Encapsulation e1=new Encapsulation("Sheela","Varunkamal");
		System.out.println(e1.name);
		System.out.println(e1.gfName);
		//e1.getGfName("Chandrika");
		//System.out.println(e1.getGfName());
		e1.setGfName("chandu");
		System.out.println(e1.getGfName());
		//System.out.println(e1.setGfName());
		//e1.setGFName("Chandrika");

	}
}
