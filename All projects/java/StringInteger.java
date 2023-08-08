												//HACHERRANK ALL PROBLEMS



import java.util.Scanner;

public class StringInteger {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
				System.out.println("Enter a string:");
                String s1=sc.next();
				System.out.println("Enter a Integer");
                int x=sc.nextInt();
                System.out.printf("%-17s %03d\n", s1, x);
                //Complete this line
            }
            System.out.println("================================");

    }
}
