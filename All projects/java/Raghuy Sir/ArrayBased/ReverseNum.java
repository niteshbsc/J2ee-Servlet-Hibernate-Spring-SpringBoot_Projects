import java.util.Scanner;
class ReverseNum {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     //int i=0,n=234;
       int rev =0;
       while(n!=0){
         int s=n%10;
         rev=rev*10+s;
         n=n/10;
    //   n++;
       }
       System.out.println(rev);
    }
}
