package DSA.JAVA.minfile;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int sum=0;
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
           // sum=i*sum;
            System.out.println(n+"*"+i+"="+n*i);
        }
        System.out.println("The sum of natural numbers: "+n);
    }
}
