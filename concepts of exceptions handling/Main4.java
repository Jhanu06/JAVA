
//exception handling -try,catch,throw,finally

// class jhanuException extends Exception
// {

// }
public class Main4 {
    public static void main(String[] args) {
        // int a=0;
        // int b=10/a;
        // System.out.println(b);
        // System.out.println("bye");  error - exception

// handle-try,catch
       
        // divison by zero
        // int j = 0;
        // try
        // {
        //     j=10/0;
        // }
        // catch(Exception e)
        // {
        //     System.out.println(j);
        //     System.out.println(e); // printing excepion
        // }
       
// out of bound

        // int a[]=new int[3];
        // try{
        //     System.out.println(a[4]);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("error :" );
        // }
        // if there is more exceptions we need to create catch blocks fro that each exception 
        
// using throw keyword to throw exc then catch is taking that

        // int i=0;
        // int j = 0;
        // try
        // {
        //     j=10/i;
        //     if (j==0)
        //     throw new ArithmeticException("hlow"); 
        //    // throw new ArithmeticException(); // we cant call the catch drctly
        // }
        // catch(ArithmeticException e)
        // {
        //     j=10/1;
        //     System.out.println("default" + e);

        // }
        // catch(Exception e)
        // {
        //     System.out.println("something went wrong" + e);
           
        // }

// we can also create our exception

    //   int i=0;
    //   int j=0;
    //   try
    //   {
    //     j=10/i;
    //     throw new jhanuException(); // if u send anything we need to define that in our class 
    //   }
    //   catch(Exception e)
    //   {
    //     System.out.println("my own exception" + e);
    //   }

// finally keyword

      int i=0;
      int j=0;
      try
      {
        j=10/i;
        System.out.println("hlo"); // if we have an exception in try block it drctly goes to catch without going to next

      }
      // we can use throws exception without catch
      catch(Exception e)
      {
        System.out.println("something happened" + e);
      }
      //finally block executes irrespective of the exception 
      // when we have to close resorces we use this finally without catch
    
      finally
     {
        System.out.println("hlo");
     }
    }
}