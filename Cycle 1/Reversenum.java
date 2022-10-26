import java.util.Scanner;

public class Reversenum {

    public static int reverse(int n){

        int digit,rev=0;
        while (n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=read.nextInt();
        int rev=reverse(num);
        System.out.print("The Reverse is: "+rev);

        read.close();
    }
}
