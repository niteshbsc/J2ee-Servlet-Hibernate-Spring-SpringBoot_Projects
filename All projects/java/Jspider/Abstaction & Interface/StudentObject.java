class StudentObject 
{
	public static void main(String[] args) 
	{ 
		Student s=new Student("Nitesh",25,700471);
		System.out.println(s);
	}
}
class Student
{
	String name;
	int roll;
	long contactno;
	public Student(String name, int roll,long contactno)
	{
		this.name=name;
		this.roll=roll;
		this.contactno=contactno;
	}
public String toString()
{
	return name;
}
}