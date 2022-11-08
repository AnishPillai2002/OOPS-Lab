
import java.util.Scanner;
import java.util.StringTokenizer;



public class Tokenizer {
    
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        String data=read.nextLine();

        StringTokenizer st=new StringTokenizer(data," ");

        int sum=0;
        System.out.println("The Numbers are: ");
        while(st.hasMoreTokens()){
            int digit=0;
            digit=Integer.parseInt(st.nextToken());
            System.out.println(data);
            sum=sum+digit;
        }
        System.out.println("Sum = "+sum);

    }
}
