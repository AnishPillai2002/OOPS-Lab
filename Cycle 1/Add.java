import java.util.Scanner;

public class Add{

    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1=read.nextInt();
        System.out.print("Enter Number 2: ");
        int num2=read.nextInt();
        int sum=num1+num2;
        System.out.print("The Sum = "+sum);

        read.close();
    }
}