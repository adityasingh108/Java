package AccessModifier;
import AccessModifier.mypack1.demo1;

public class test {
    demo1 obj = new demo1();

    public static void main(String[] args) {
        test obj2 = new test();
        // obj2.obj.show();

        // System.out.println("a = " + obj2.obj.a);  // default is not accsesible 
        System.out.println("b = " + obj2.obj.b); // public is accsesible
        // System.out.println("c = " + obj2.obj.c); // private is not accsesible
        // System.out.println("d = " + obj2.obj.d); // protected is not accsesible
    
    }
}
