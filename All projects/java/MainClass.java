import Atmm.*;
import java.util.Scanner;
public class MainClass{
	public static void main(String[] args){

	AtmOperationInterface op= new AtmOperationImpl();
	int atmnumber= 12345;
	int atmpin= 123;
	Scanner in=new Scanner(System.in);
	System.out.println("Welcome to ATM Machine!!!");
	System.out.println("Enter Atm no:");
	int atmNumber=in.nextInt();
	System.out.println("Enter Your Pin:");
	int pin=in.nextInt();
	
	if((atmnumber==atmNumber)&&(atmpin==pin)){
	while(true){
	System.out.println("1.View Available Balance\n 2.Withdraw Amount\n 3.Deposite Amount\n 4.View Ministatement\n 5.Exit");
	System.out.println("Enter Choices:");
	int ch= in.nextInt();
		if(ch==1){
			op.viewBlance();
	}
		else if(ch==2){
	}
		else if(ch==3){
			System.out.println("Enter Amount to Deposite:");
			double depositeAmount= in.nextDouble();//5000
			op.depositeAmount(depositeAmount);
	}
		else if(ch==4){
	}
		else if(ch==5){
			System.out.println("Collect your ATM card\n Thank you for using ATM Machine");
			System.exit(0);
	}
		else{
		System.out.println("Please enter correct choices");
	}
	
	}
	}
	else{
	System.out.println("Incorrect Atm No. or Pin");
	System.exit(0);
}
}
}