import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){

        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }

    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n=read.nextInt();
        int fact=factorial(n);
        System.out.println("The Fatorial is: "+fact);

        read.close();

    }
}
