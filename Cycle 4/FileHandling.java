//Write a file handling program in Java with reader/writer

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class FileHandling{

    //Method to write into the File
    static void Write(){

        try{
            // creating a File
            FileWriter fw=new FileWriter("Thanos.txt");
            //Writing into the File
            fw.write("The Hardest Choices Require The Strongest Wills");
            //closing the writer object
            fw.close();
            System.out.println("Content written into Thanos.txt");
        }
        catch(IOException e){
            System.out.println("Unexcepted Error");
        }
       

    }

    // Method to read from a File
    static void Read(){

        try{
            //Reading the File
            FileReader fr=new FileReader("Thanos.txt");
            System.out.println("File Content is:");
            int i;
            while((i=fr.read())!=-1){
                
                System.out.print((char)i);
            }
            System.out.println();
            fr.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println("Unexpected Error");
        }
    }

    //Driver Function
    public static void main(String[] args){
        Write();
        Read();
    }
}
