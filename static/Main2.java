

class person
{
    int age; //instance variable
    static String name;
    public void show()
    {
        System.out.println(age + name);
    }
    //Constructor
    public person()
    {
       // name="";
        int age=25;
        System.out.println("constructor block");

    }
    // we r initailizes and changes the instance varaible but static variable is remains same 
    //so for that y we need to incude that in contructr we can use a static block
    // static block - it only iterates once even we r having multiple objects
    static {
      name="suni";
      System.out.println("static block");
    }
}
public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException {
        // person obj1=new person();
        // obj1.age=23;
        // obj1.name="jhanu";
        // obj1.show();

        //if we r not calling or creating a obj no blocks executes
      //  but in java we have a class block 
      Class.forName("person"); // we need exception handlings 
    }
}
