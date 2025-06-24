
// constructors
 
// with getter and setter

// class human
//  { 
//     private int age;
//     private String name;

//     public human(){
//     System.out.println(" default constructor method");
//             age=32;
//             name="jhanu";

//     }
//     public human(int a,String name){
//         System.out.println("paramerized constructor method");
//                 age=a;
//                 this.name=name;
                
//         }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }
// }
// class cons{
//     public static void main(String[] args) {
//        human obj1=new human();
//        System.out.println("age" + " : " + obj1.getAge()+ "name" + ":"+ obj1.getName());

//        human obj=new human(18,"bhanu"); // obj created 
//        System.out.println("age" + " : " + obj.getAge()+ "name" + ":"+ obj.getName());
//     }
// }


//  without getter and setter
class human{
    int age;
    String name;

    public human() {
        age=28;
        name="gowthu";
    }

    public human(int age, String name) {
        this.age = age;
        this.name = name;
    }

}
class cons{
    public static void main(String[] args) {
      
        human obj1 = new human();
        System.out.println("age: " + obj1.age + " | name: " + obj1.name);
        human obj2 = new human(20, "suni");
        System.out.println("age: " + obj2.age + " | name: " + obj2.name);
    }
 }

