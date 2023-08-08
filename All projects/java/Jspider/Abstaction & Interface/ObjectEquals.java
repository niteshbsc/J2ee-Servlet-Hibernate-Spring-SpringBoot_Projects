class ObjectEquals 
{
	public static void main(String[] args) 
	{
		/*Book2 b=new Book2("Nitesh",400);
		Book2 b1=new Book2("Java",300);
		System.out.println(b==b1);
		System.out.println(b.equals(b1));
		//Book2 b2=b;
		Book2 b4=new Book4("Python",200);
		System.out.println(b==b4);
		System.out.println(b.equals(b4)); */
	 
	 	Book2 b1=new Book2("Nitesh",400);
		Book2 b2=new Book2("Nitesh",400);
		Book2 b3=new Book2("Java",300);
		System.out.println(b1==b2); //false (because Address are different)
		System.out.println(b1.equals(b2)); //true
		System.out.println(b1==b3);  //false
		System.out.println(b1.equals(b3)); //false

	}
}
class Book2
{
	String title;
	int pages;
	public Book2(String title,int pages)
	{
		this.title=title;
		this.pages=pages;
	}
	public String toString()
	{
		return title;
		//return pages;
	}
	public boolean equals(Object O)
	{
		Book2 b5= (Book2)O;  //Downcasting
		if(this.title==b5.title && this.pages==b5.pages)
			return true;
		else
			return false;
	}
}