
// //abstract

// abstract class car{
//  public void drive()
//  {

//  }

//this is no need of this method but it is useful so we r refering as abstract 
//which is to create a having a presence of it but it is implemented at diff place

// public abstract void drive(); // defining

// abstract key word we r using in defining method
// if we using abstract method there should be abstract class

//  public void running()
//  {
//    System.out.println("running..");
//  }
// }

// we can have abstract class without abstract method


// class car1 extends car{
//     public void drive()
//     {
//         System.out.println("driving..");
//     }
// }

// public class abs {
//     public static void main(String[] args) {
//         car obj=new car1();
//         obj.drive();
//         obj.running();

//         // we r not able to create a obj for abstract class
//     }
// }


// inner class-class inside a class

// class A{
//     int age;
//     public void show()
//     {
//         System.out.println("class a method");
//     }
//     // class B{
//     //     public void display()
//     // {
//     //     System.out.println("class b method");
//     // }
//     static class B{
//         public void display()
//     {
//         System.out.println("class b method");
//     }
//     }
// }
// class abs{
//     public static void main(String[] args) {
//         A obj=new A();
//         obj.show();

//         //A.B obj1=obj.new B();
//        A.B obj1=new A.B(); // for static methos(no need of using oj) -a belongs to b which is inner class
//         obj1.display();
//     }
// }


// anonyms inner class


// class A{
   
//     public void show()
//     {
//         System.out.println("class a method");
//     }
// }

// class abs{
//     public static void main(String[] args) {
//         // instead of creating a diff class we can ue anonymns inner class
//         A obj=new A()
//         {
//             public void show()
//             {
//                 System.out.println("class b method");
//             }
//         };
//        obj.show();
//     }
// }

// abstract class and inner class

abstract class A{
   
    abstract public void show();
    abstract public void show1();
}

class abs{
    public static void main(String[] args) {
        // instead of creating a diff class we can ue anonymns inner class
        A obj=new A()
        {
            public void show()
            {
                System.out.println("class method-1");
            }
            public void show1()
            {
                System.out.println("class method-2");
            }
        };
       obj.show();
       obj.show1();
    }
}