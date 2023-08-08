class ObjectToString 
{
	public static void main(String[] args) 
	{
		Book1 b=new Book1("Ramayan",2000);
		Book1 b1=new Book1("Succes of Life",200);
		System.out.println(b);
		System.out.println(b1);
	}
}
class Book1
{
	String name;
	int page;
	public Book1(String name, int page)
	{
		this.name=name;
		this.page=page;
	}
	public String toString()
	{
		return name+" "+page;
	}
}