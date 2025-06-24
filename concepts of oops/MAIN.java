
//usage of this and super ,final  keywords

// this()=reference to current main constructor
// super()=refers to super class of constructor
class a{
    public a()
    {
        super();
        System.out.println(" a constructor");
    }
    public a(int a)
    {   this();
        System.out.println(" a para constructor");
    }
}
class b extends a{
    public b()
    {   
        //super(); its taking its main super class ie A class default const
        super(3); //A's constr
        System.out.println(" b constructor");

        
    }
    public b(int a)
    {   this(); //it shows the B's class -current one
        System.out.println(" b para constructor");
    }
}

public class MAIN {
    public static void main(String[] args) {
        b obj=new b(4);

    }
}


// final keyword is similar to constant we cant change it as it is fixed 
//we can use final in variable,method,class
//using this final keyword -we can stop inherit properties