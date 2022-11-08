class Student{

    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

}

class gc{

    public static void main(String[] args) {
    Student S1=new Student("Anish",20);
    System.out.println("Name : "+S1.name+"| Age : "+S1.age);
    System.out.print("Before : ");
    System.out.println(Runtime.getRuntime().freeMemory());

    S1=null;
    System.gc();
    System.out.print("After  : ");
    System.out.println(Runtime.getRuntime().freeMemory());
    System.out.println("Garbage Collection Done");
    }
}
