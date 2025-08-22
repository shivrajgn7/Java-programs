import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n<=0) {
            System.out.println("Not a prime");
        }
           // return false;
        for(int i=2;i<=n;i++){
            if(n%2==0){
                System.out.println("Not a prime number");
             //   return false;
            }else System.out.println("Prime number"+n);
        }

    }
}
