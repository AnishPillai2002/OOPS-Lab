import java.io.*;
import java.util.*;


public class QuickSort{

    //Function to Swap
    static void swap(String[] arr, int i,int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Function to Partition
    static int partition(String[] arr,int low,int high){
        int i=low-1;
        String pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j].compareTo(pivot)<0){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;  //partitioning index
    }

    //QUICKSORT Function
    static void quicksort(String[] names,int low,int high){

        if(low<high){

            int p=partition(names, low, high);
            quicksort(names, low, p-1);
            quicksort(names, p+1, high);
        }
    }

    //Function to Print array
    static void printarray(String[] arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Driver code
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        String [] arr=new String[10];
        int n;

        System.out.print("Enter the Total Number of Names: ");
        n=read.nextInt();
        read.nextLine();

        int i=0;
        System.out.println("Enter Names:");
        while(i<n){
            arr[i]=read.nextLine();
            i++;
        }
        System.out.print("The Array is : ");
        printarray(arr,n);

        System.out.print("Sorted Array : ");
        quicksort(arr, 0, n-1);
        printarray(arr,n);
    }

}
