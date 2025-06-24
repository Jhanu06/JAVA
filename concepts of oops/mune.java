
// enum
// enum status{
//    // named consts

//     running, Failed, pending, success;

// }
// public class mune {
//     public static void main(String[] args) {
//        // status obj=status.Failed;
//          // to get all values
//          status[] obj1=status.values();
//          for(status s : obj1)
//          {
//             System.out.println( s+ " : " + s.ordinal());
//          }
//     }
// }

//we can use if-else, loop, switch but we cannot extend

enum fruits{
    apple(100),mango(400),pineapple(50);
     private int price;
    
     // if we dont mention any values for price in intialization we can call default constructor
     private fruits(int price)
     {
         this.price=price;
     }
     // since there r private we r not accessing them we use g and s

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
class mune{
    public static void main(String[] args) {
        fruits[] f = fruits.values();
        for(fruits s : f)
         {
          System.out.println( s+ " : " + s.ordinal() + " price : "+ s.getPrice());
         }
    }
}