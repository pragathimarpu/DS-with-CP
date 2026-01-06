paste your code here
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
     int data;
     Node next;
     
     //constructor
     Node(int a){
         data=a;
         next=null;
     }
     //getData
     public void getData(){
         System.out.println(data);
     }
     //method getRef
     public void getRef();
     System.out.println(next);
    
}
}
      class Main {
    public static void main(String[] args) {
        System.out.println("Pragathi");
        Node a=new Node(100);
        System.out.println("a");
        a.getData();
        a.getRef();
        Node b = new Node(10);
        b.getData();
        System.out.println(b);
        
        Node c = new Node(50);
        c.getData();
        
    }
}
