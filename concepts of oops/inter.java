
//interface

// we r creating interface instead of abstract

interface A{

    // it is nt a class
    // interface is always public so need not to mention again 
    // THE VARIABLES  in this is by default final and static
    
    static int age=22;
    void show();
    void display();

    // interface just show the methods that's it ...
    // it doesn't implement the methods
}
// we use implements keyword to implement the methods in interface
// in abstract we can only access one class but interface can have multiple

interface x{
    void run();
}
// we can also inherit
interface  c extends x{

}
class B implements A,x{

    public void show() {
        System.out.println(" in show method");
    }

    public void display() {
        System.out.println(" in display method");  
      }
      public void run()
      {
        System.out.println(" in run method"); 
      }

}
public class inter {
    public static void main(String[] args) {
      A obj=new B();   
      obj.show();
      obj.display();

      x obj1= new B();
     obj1.run();
    //obj.run(); // showing error
    //  System.out.println(A.age);
    }
}
