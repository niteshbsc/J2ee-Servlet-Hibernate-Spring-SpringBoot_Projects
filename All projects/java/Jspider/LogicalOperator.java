class LogicalOperator 
{
	public static void main(String[] args) 
	{
		String name1="Sharmila";
		String name2="Mala";
		String name3="SHARMILA";
		boolean res1=name1!=name2 && name1==name3;
		boolean res2=!(name1!=name3);
		System.out.println(res1);
		System.out.println(res2);
		

		int n1=3;
		int n2=6;
		boolean res=n1++ ==3 || ++n2==6;
		System.out.println(res);
		System.out.println(n1);
		System.out.println(n2);
	}
}
