import java.util.Scanner;

public class BinarySearch {


    // Function to BubbleSort
    static void bubblesort(int[] arr,int n){
        int i,j;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //Function to do Binary Search
    static void binsearch(int[] arr,int key){

        int f=0;
        int l=arr.length-1;
        int flag=0;
        int m=0;
        while(f<l){

            m=(f+l)/2;
            if(arr[m]==key){
                flag=1;
                break;
            }

            if(arr[m]<key){
                f=m+1;
            }
            else{
                l=m-1;
            }
        }

        if(flag==0){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element found at index : "+m);
        }
    }

    //Function to Print array
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    // Driver Function
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);  
        System.out.print("Total Numbers: ");
        int total=read.nextInt();
        read.nextLine();
        int[] arr=new int[total];

        int i=0;
        System.out.println("Enter the Numbers");
        while(i!=total){
            arr[i]=read.nextInt();
            read.nextLine();
            i++;
        }
        System.out.print("Array : ");
        printarray(arr);

        bubblesort(arr, total);
        System.out.print("Sorted Array: ");
        printarray(arr);

        System.out.print("Enter the Element to Search : ");
        int k=read.nextInt();
        read.nextLine();

        binsearch(arr,k);

        
    }

    
}
