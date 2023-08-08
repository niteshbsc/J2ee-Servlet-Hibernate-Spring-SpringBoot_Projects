class DriverHuman 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee("Nitesh",25,"Male","Nitesh123");
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.gender);
		System.out.println(e.id);

		Student s=new Student("Gorai",24,"Male","MCA",84);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.gender);
		System.out.println(s.qualification);
		System.out.println(s.percentage);
	}
}
