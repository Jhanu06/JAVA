
import java.util.Scanner;

class Main {
    int stack[]=new int[4];
        int top=0;
    
    public static void main(String[] args) {
       Main s=new Main();
       Scanner x= new Scanner(System.in);
        int exp=0;
        while(true)
        { 
            System.out.println("enter option to perform operations:\n 1.push\n 2.pop\n 3.peek\n 4.size of stack\n 5.isEmpty\n 6.isFull" );
            exp=x.nextInt();
        switch(exp)
        {
            case 1: System.out.println("enter element to push into the stack:"); 
            int a=x.nextInt();
            s.push(a);
            break;
            case 2:System.out.println("enter element to pop from the stack:" + s.pop()); 
            break;
            case 3:System.out.println("The top most element in the stack:" + s.peek()); 
            break;
            case 4:System.out.println("Size of the stack:" + s.size()); 
            break;
            case 5:System.out.println("Is stack Empty:" + s.isEmpty()); 
            break;
            case 6:System.out.println("Is stack full:" + s.isFull()); 
            break;
            case 7:
            System.out.println("Exiting...");
            System.exit(0);
        default:
            System.out.println("Invalid option");
        }
      
    }   
 }
    public void push(int a)
    {   
       if(isFull())
       {
        System.out.println("the stac is full");
       }
       else{
        stack[top]=a;
        top++;
        System.out.println(a + "the elements are pushed");
       }
    }
    
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("the stack is empty");
            return -1;
        }
        else{
            top--;
            int a=stack[top];
            stack[top]=0;
            return a;
        }
    }
    public int peek()
    {    if(isEmpty())
        {
            System.out.println("the stack is empty");
            return -1;
        }
        else{
         return stack[top-1];
        }
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty() {
        return top==0;
    }

    public boolean isFull() {
        return top==stack.length;
    }

}
