// create a doubly linked list of elements

import java.util.*;


class DLL{

    // head of DLL
    Node head=null;
    class Node{
        public Node prev;
        public Node next;
        public int data;
        // defining the constructor
        Node(int d){
            this.data=d;
        }
    }

//Function to insert node at the front
    public void insertFront(int d){
        // creating a new node with data
        Node newnode=new Node(d);
        // Making next of new node as head and prev as null
        newnode.next=head;
        newnode.prev=null;

        // changing prev of headnode to newnode
        if(head!=null){
            head.prev=newnode;
        }
        // head is newnode now
        head=newnode;
        System.out.println(d+" Added to the Front");
    }

// Function to insert node at the end
    public void insertEnd(int d){
        // creating a new node with data
        Node newnode=new Node(d);
        // creating a node to iterate from head to end
        Node last;
        last=head;
        //Making next of newnode as null and prev as last node
        newnode.next=null;
        // if the DLL is empty then
        if(head==null){
            
            head=newnode;
            return;       
        }
        // iterating till last node of DLL
        while(last.next!=null){
            last=last.next;
        }
        // Making prev of newnode as last node 
        newnode.prev=last;

        // Making next of last as newnode
        last.next=newnode;

        System.out.println(d+ " Added to List at End");
    }

// Function to insert at any position
    public void insertAt(int d, int index){
        
        Node newnode=new Node(d);
        Node ptr=head;

        // Condition for empty List
        if(head==null){
            System.out.println("List is Empty! Add Elements");
            return;
        }

        // Condition to insert at front
        if(index==0){
            newnode.next=head;
            newnode.prev=null;

            if(head!=null){
                head.prev=newnode;
            }
            head=newnode;
            System.out.println(d+" Added to the Front");
            return;
        }

        // Iterating till index position
        int i=0;
        while(i<index-1){
            ptr=ptr.next; // moving ptr to next node
            i++;          // incrementing i
        }

        // Making next of newnode as ptr.next
        newnode.next=ptr.next;

        // Making prev of newnode as ptr
        newnode.prev=ptr;

        // Making node after ptr connect with newnode
        Node temp=ptr.next;
        temp.prev=newnode;

        // Making next of ptr as newnode
        ptr.next= newnode;

        System.out.println(d + " added at position "+ index);                 
    }


// Function to print Linked List
    public void print(Node node){

        if(node==null){
            System.out.println("The DLL is Empty");
            return;
        }
        // condition for DLL with elements
        else{
            Node last=node;
            // iterating DLL till last node
            while(last.next!=null){
                System.out.print(last.data+" ");
                last=last.next;
            }
            System.out.println(last.data);
            System.out.println();
        }
    }

// Function to delete from Front
    public void deleteFront(){

        //condition for empty list
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        // deleted element
        int element=head.data;
        // temp is the node after head
        Node temp=head.next;
        // breaking the link with head
        temp.prev=null;
        // new head
        head=temp;
        System.out.println(element+" removed from List");
    }


// Function to Delete from End
    public void deleteEnd(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        // iterating the DLL
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        // Deleted element
        int element=ptr.data;

        // temporary second last node
        Node temp=ptr.prev;

        // making temp last
        temp.next=null;

        System.out.println(element+" removed from List");
    }


// MAIN FUNCTION
    public static void main(String[] arg){

        Scanner read=new Scanner(System.in);

        // creating object of DLL class
        DLL dll=new DLL();

        int op,d;
        boolean conti=true;
        while(conti){
            System.out.println("+-----------------------------+");
            System.out.println("| 0 : exit                    |");
            System.out.println("| 1 : Insert at End of List   |");
            System.out.println("| 2 : Insert at Front of List |");
            System.out.println("| 3 : Insert At an Index      |");
            System.out.println("| 4 : Display List            |");
            System.out.println("| 5 : Delete from Front       |");
            System.out.println("| 6 : Delete from End         |");
            System.out.println("+-----------------------------+");
            System.out.print("Choose an Option: ");
            op=read.nextInt();

            switch (op){
                
                case 0:
                    conti=false;
                    System.out.println("Exiting........");
                    break;
                case 1:
                    System.out.print("Enter Element: ");
                    d=read.nextInt();
                    dll.insertEnd(d);
                    break;
                case 2:
                    System.out.print("Enter Element: ");
                    d=read.nextInt();
                    dll.insertFront(d);
                    break;
                case 3:
                    System.out.print("Enter Element: ");
                    d=read.nextInt();
                    System.out.print("Enter the Index: ");
                    int index=read.nextInt();
                    dll.insertAt(d,index);
                    break;

                case 4:
                    // printing all elements from the head node
                    dll.print(dll.head);
                    break;

                case 5:
                    dll.deleteFront();
                    break;
                
                case 6:
                    dll.deleteEnd();
                    break;

                default :
                    System.out.println("ENter a Valid Option");
                    break;
            }
        }
    }

}
