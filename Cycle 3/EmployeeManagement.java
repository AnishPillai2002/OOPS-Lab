import java.io.*;
import java.util.Scanner;

class Employee{
    String name,phone_no,address;
    int age,salary;

    public void printSalary(){
        System.out.print(this.salary);
    }
  
}


class Officer extends Employee{
    public String specilization;

    //Function to read Officer Details
    void readOfficer(){
        Scanner read=new Scanner(System.in);

        System.out.print("Employee Name: ");
        name=read.nextLine();
        System.out.print("Employee Age: ");
        age=read.nextInt();
        String enter=read.nextLine();
        System.out.print("Employee Phone Number: ");
        phone_no=read.nextLine();
        System.out.print("Employee Address: ");
        address=read.nextLine();
        System.out.print("Employee Salary: ");
        salary=read.nextInt();
        read.nextLine();
        System.out.print("Specilization: ");
        specilization=read.nextLine();
    }

    // Function to Display Employee Details
    void printOfficer(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Address : "+this.address);
        System.out.println("Phone : "+this.phone_no);
        System.out.println("Salary : "+this.salary);
        System.out.println("Specilization : "+this.specilization);
    
    }

}

class Manager extends Employee{
   public String department;

   // Function to Read Manager Details
   void readManager(){
        Scanner read=new Scanner(System.in);

        System.out.print("Employee Name: ");
        name=read.nextLine();
        System.out.print("Employee Age: ");
        age=read.nextInt();
        String enter=read.nextLine();
        System.out.print("Employee Phone Number: ");
        phone_no=read.nextLine();
        System.out.print("Employee Address: ");
        address=read.nextLine();
        System.out.print("Employee Salary: ");
        salary=read.nextInt();
        read.nextLine();
        System.out.print("Department: ");
        department=read.nextLine();

    }

    //Function to Display Manager Details
    void printManager(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Address : "+this.address);
        System.out.println("Phone : "+this.phone_no);
        System.out.println("Salary : "+this.salary);
        System.out.println("Department : "+this.department);
    
    }
}


// Main class
public class EmployeeManagement{

    public static void main(String[] args) {

        Officer p1= new Officer();
        Manager p2=new Manager();

        System.out.println("\nEnter Details of Officer: ");
        p1.readOfficer();

        System.out.println("\nEnter Details of Manager: ");
        p2.readManager();

        System.out.println("\n\nDetails of Officer");
        p1.printOfficer();
        System.out.println("\nDetails of Manager");
        p2.printManager();        
    }
}
