package DSA.JAVA.minfile;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a ==b){
            System.out.printf("equal");
        }
        else if(a>b){
            System.out.printf("A is greater");
        }
        else if(b>a){
            System.out.printf("B is greater");
        }
        else{
            System.out.printf("odd");
        }
    }
}
