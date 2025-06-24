//encapsulation- setter and getter methods

class student
{
   // private int roll=32;
   private int roll;
    String name;
    String branch;

    // public int getroll()
    // {
    //    return roll;
    // }
    // we can assign a value to private variable using setter
    // public void setroll(int a)
    // {
    //     roll=a;
    // }

    // right click-source action-generate getter and setter 
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

}
public class encap {
    public static void main(String[] args) {
        student obj=new student();
        obj.name="jhanu";
        obj.branch="csm";
       // obj.roll=32;
       obj.setRoll(32);
        System.out.println(obj.name + " : " + obj.getRoll());
    }
}
