package staticAndFinal;

/* 
for identifiers  use for the constant variables
1. for defing time 
2. in the static block or block 
3.  in the constructor 
*/
class My{
    final int MAX = 50; //
    final int MIN;
    {
        MIN= 01;
    }

    final int MID;
    public My(){
        MID = 25;
    }
}


/*
for method to restrict the method overriding 
you can restrict your method overriding by usinh the final keyword
 */
class ResMethod{
    final void myMethod(){
        System.out.println("My method ");
    }
} 

class ExtendYourCLass extends ResMethod{
    // void myMethod(){
    //     System.out.println("can not override the orignal method ");
    // }
}

/*
 for  restrict  the inheritance   we use the final class  keyworad 
 */
final class  RestrictInheritance{
    void CannotInherit(){
        System.out.println("inheritance is not allowed");
    }
}

// class inherite  extends RestrictInheritance{
//    // cannot inherit the class  
// }
public class finalKeyword {
    public static void main(String[] args) {
        
    }
}
