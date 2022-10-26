import java.io.*;
import java.util.Scanner;

class Employee{
    String name,phone_no,address;
    int age,salary;

    public void printSalary(){
        System.out.print(this.salary);
    }

    static void readEmployee(Employee e){
        String type;
        if (e instanceof Officer){
            type="Officer";
        }
        else{
            type="Manager";
        }
        Scanner read=new Scanner(System.in);

        System.out.print("Employee Name: ");
        e.name=read.nextLine();
        System.out.print("Employee Age: ");
        e.age=read.nextInt();
        String enter=read.nextLine();
        System.out.print("Employee Phone Number: ");
        e.phone_no=read.nextLine();
        System.out.print("Employee Address: ");
        e.address=read.nextLine();
        System.out.print("Employee Salary: ");
        e.salary=read.nextInt();
    }

    static void printEmployeeDetail(Employee e){
        System.out.println(String.format("Name : %s \nAge: %d \nPh_no: %s \nAdddress: %s \nSalary: %d \nPost: %s \n",e.name,e.age,e.phone_no,e.address,e.salary,e.getClass().getName()));

    }
}

class Officer extends Employee{
    String Specilization;
}

class Manager extends Employee{
    String department;
}


// Main class
public class EmployeeManagement{

    public static void main(String[] args) {

        Officer p1= new Officer();
        Manager p2=new Manager();

        System.out.println("\nEnter Details of Officer: ");
        Employee.readEmployee(p1);

        System.out.println("\nEnter Details of Manager: ");
        Employee.readEmployee(p2);

        System.out.println("\n\nDetails of Officer");
        Employee.printEmployeeDetail(p1);
        System.out.println("\nDetails of Manager");
        Employee.printEmployeeDetail(p2);        
    }
}
