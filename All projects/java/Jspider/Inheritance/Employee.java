class Employee extends Human 
{
	String id;
	public Employee(String name,int age,String gender,String id)
	{
		super(name,age,gender);
		this.id=id;
	}
}
