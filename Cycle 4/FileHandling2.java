//Write a java program that reads from a file and write to fie by handling all file related exceptions


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileHandling2 {

    static void ReadWrite(){

        try{
            //Reading the File
            FileReader fr=new FileReader("Thanos.txt");
            FileWriter fw=new FileWriter("Copy.txt");

            int i;
            while((i=fr.read())!=-1){
                char ch=(char)i;
                fw.write(ch);
            }
            System.out.println("Content Copied");
            fr.close();
            fw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println("Unexpected Error");
        }        
    }

    public static void main(String[] args) {
        ReadWrite();
    }
}
