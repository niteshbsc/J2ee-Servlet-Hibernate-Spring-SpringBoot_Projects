  public class Power 
{  
public static void power(int base, int exponent)  
{  
int power = 1;  
for (int i = 1; i <= exponent; i++)   
power = power * base;   
System.out.println(power);  
}  
public static void main(String[] args)
	{
		power(5,3);
	}
}