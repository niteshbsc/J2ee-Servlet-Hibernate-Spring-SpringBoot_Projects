import java.util.Scanner;

public class Calculator{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a two number:");
double First=sc.nextDouble(); 
double Second=sc.nextDouble(); 
System.out.println("Enter a operator (+,-,/,*,%): ");
char operator=sc.next().charAt(0);
double result;

switch(operator){
case '+':
result=First+Second;
break;
case '-':
result=First-Second;
break;
case '/':
result=First/Second;
break;
case '*':
result=First*Second;
break;
case '%':
result=First%Second;
break;


default:
System.out.println("Operator is not correct");
return;
}
System.out.printf("%.1f %c %.1f=%.1f", First,operator,Second,result);
}
}