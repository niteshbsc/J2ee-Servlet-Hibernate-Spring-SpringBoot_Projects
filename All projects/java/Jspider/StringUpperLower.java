import java.util.Scanner;

public class StringUpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int uc=0,lc=0,dc=0,spc=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') 
				uc++;
			else if(ch>='a' && ch<='z') 
				lc++;
			
			else if(ch>='0' && ch<='9') 
				dc++;
			
			else 
				spc++;
		}
			System.out.println("Number of the capital letters:"+uc);
			System.out.println("Number of thr Small letter"+lc);
			System.out.println("Number of the Digit"+dc);
			System.out.println("Number of the Special Characters"+spc);
			
		}
	}


