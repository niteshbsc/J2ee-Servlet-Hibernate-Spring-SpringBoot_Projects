class Recursion
{
	int func(int n){
	int result;
	if(n==1)
		return 1;
	result=func(n-1);
	return result;

	}
}
class Fynonix 
{
	static public  void main(String[] args) {
		int count=1;
		while(count<=15){
			System.out.println(count%2==1?"***":"+++++");
			++count;
		}
	//Recursion rs=new Recursion();
	//System.out.println(rs.func(5));
	//public static void main(String[] args) 
	//{
	//	char ch[]={'a','b','c'};
	//	String s=new String(ch);
	//	System.out.println(s);
	//}
}
}
