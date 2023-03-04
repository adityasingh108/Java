package InnerClass;

class outerClass{
    int x = 10;
    class innerClass{
        int y = 5;
        void displayInner(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerDisplay(){
        // create a object of the inner class inside the outer classs 
        innerClass ic1 = new innerClass();
        ic1.displayInner();
    }
}


public class InnerClassJava {
    public static void main(String[] args) {
        // now we create the object of the outer class and access the x ;
        outerClass  out1 = new outerClass();
        System.out.println(out1.x);
        out1.outerDisplay();



        /// now accesss the inner classs objct and the method 
        outerClass.innerClass oi = new outerClass().new innerClass();
        oi.displayInner();
        System.out.println(oi.y);
    }
}
