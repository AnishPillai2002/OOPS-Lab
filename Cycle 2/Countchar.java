import java.util.*;



public class Countchar{

    public static int count(String str,char c){

        int len=str.length();
        int count=0;

        for(int i=0;i<len;i++){

            if(c==str.charAt(i)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){

        Scanner read=new Scanner(System.in);

        System.out.print("Enter the String: ");
        String word=read.nextLine();

        System.out.print("Enter the Character: ");
        char c=read.next().charAt(0);

        int total=count(word,c);
        System.out.print("\n"+c+" repeats "+total+" times\n");   
        read.close();
    }
    
}