class Student extends Human 
{
	String qualification;
	double percentage;
	public Student(String name,int age,String gender,String qualification,double percentage)
	{
		super(name,age,gender);
		this.qualification=qualification;
		this.percentage=percentage;
	}
}
