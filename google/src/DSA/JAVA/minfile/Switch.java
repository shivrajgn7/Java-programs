package DSA.JAVA.minfile;

import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter Button");
        int button=sc.nextInt();
        switch (button){
            case 1: System.out.println("Hello");
                    break;
            case 2:
                System.out.println("Namasthe");
                break;

            case 3:
                System.out.println("Nanni");
                break;

            default:
                System.out.printf("invalid Button");
        }
    }
}
