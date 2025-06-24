
//INHERITANCE

// class cse
// {
//     public void cse()
//     {
//             System.out.println(" cse is a base class");
//     }
// }
// class csm extends cse{
//     public void csm()
//     {
//       System.out.println("csm is a single-level inheritance csm is derived from cse(cse->csm)");
//     }
// }

// class cs extends csm{
//     public void cs()
//     {
//       System.out.println("cs is a multilevel inheritance which is cs is derived from csm and csm is derived from cse(cse->csm->cs)");
//     }
// }
// class csd extends cse{
//     public void csd()
//     {  
//       System.out.println("csd is a hierarchical inheritance which is csd is derived from cse(cse->csm,csd)");
//     }
// }


// //multiple inheritance
// //if both parents having same function -ambiguity problem- so java removed this multiple inheritance

// public class inher {
//     public static void main(String[] args) {
//          cse obj=new cse();
//          obj.cse();
//     }
// }


// method overriding

class a{
   public void show()
   {
    System.out.println("show fun");
   }
   public void config()
   {
    System.out.println("config fun");
   }
}
class b extends a{
    public void show() //this fun overrides the show method in class a
    {
        System.out.println("show derived fun");
    }
}
public class inher {
     public static void main(String[] args) {
             b obj=new b();
             obj.show();
             obj.config();
     }
    }