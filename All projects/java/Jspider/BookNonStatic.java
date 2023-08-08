class BookNonStatic 
{
	String title;
	String author;
	int noOfpages;
	double price;
	public void details()
	{
		System.out.println(title);
		System.out.println(author);
		System.out.println(noOfpages);
		System.out.println(price);
	}
	public static void main(String[] args) 
	{
		BookNonStatic s1=new BookNonStatic();
		s1.title="Life";
		s1.author="Nitesh";
		s1.noOfpages=300;
		s1.price=500.50;
		BookNonStatic s2=new BookNonStatic();
		s2.title="RomeoJuliet";
		s2.author="Jhoney";
		s2.noOfpages=500;
		s2.price=450.50;
		BookNonStatic s3=new BookNonStatic();
		s3.title="Hostory of India";
		s3.author="Chetan Bhagat";
		s3.noOfpages=600;
		s3.price=550.50;
		s1.details();
		s2.details();
		s3.details();
	}
}
