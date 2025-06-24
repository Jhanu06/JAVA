
// Static methods
class person
{
    int age; //instance variable
    static String name;
    // instance method 
    // public void show()
    // {
    //     System.out.println(name+age);
    // }
     public static void show1()
    {
        // we cannot print thee non static variables in static method 
        System.out.println("in static method");
    }
    //if we have the obj refernece we can use
    public static void show1(person obj)
    {
        // we cannot print thee non static variables in static method 
        System.out.println(obj.name+obj.age);
    }
}
public class Main3 {
    public static void main(String[] args) {
       person obj1=new person();
         obj1.age=23;
        obj1.name="jhanu";
        // obj1.show();
        person.show1(obj1);

    }
}
