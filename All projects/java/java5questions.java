import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


// 1. Write a program to print the reverse of the given string.

class ReverseString {
    public static void main(String[] args) {
        String st="codecode";
        String reverse="";
        for(int i=st.length()-1;i>=0;i--){
            reverse=reverse+st.charAt(i);
        }
        System.out.println(reverse);
    }
}


// 2. Given a number, check whether it is a prime number or not.

class Prime {
        public static boolean isPrime(int x){
            for(int i=2;i<x/2;i++){
                if(x%i==0)
                return false;
            }
            return true;
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean rs=isPrime(n);
        if(rs==true){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}

// 3. Given an array of numbers, arrange them in a way that it forms the largest value.

public class LargestValue {
    public static void main(String[] args) {
        int[] inputArray = {54, 546, 548, 60};
        String largestValue = largestNumber(inputArray);
        System.out.println(largestValue);
    }

    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        } 
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy = x + y;
                String yx = y + x;
                return yx.compareTo(xy); 
            }
        };
        Arrays.sort(arr, comparator);
        if (arr[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
}

// 4. Given a number N, print reverse of number N.

class ReverseNumber{
    public static void main(String args[]){
        int n=102;
        int rev=0;
        while(n!=0){
            int a=n%10;
            rev=(rev*10) + a;
            n=n/10;
        }
        System.out.println(rev);
    }
}


// 5. Given an array of numbers, find the maximum and minimum element in the array.

class MaximumMinumumArray {
    public static void main(String[] args) {
        int arr[]={20,23,14,56};
        int max=arr[0], min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
            else
                System.out.println();
        }
        System.out.println(max);
        System.out.println(min);
    }
}