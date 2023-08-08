class Car12 
{	
	String author;
	String title;
	double price;
	public void initialize(String author,String title,double price)
	{
		this.author=author;
		this.title=title;
		this.price=price;
	}
	public void details()
	{
		System.out.println(author);
		System.out.println(title);
		System.out.println(price);
	}
	public static void main(String[] args) 
	{
		Car12 s1=new Car12();
		s1.initialize("Nitesh","History of india",230.40);
		s1.details();
	}
}
