package InnerClass;

// in this we can create a class inside the method of the main outer class 
class Outer {
    void display() {

        class LocalInnerClass {

            void innerClassDisplay() {
                System.out.println("Im inner class display ");
            }
        }
        LocalInnerClass li = new LocalInnerClass();
        li.innerClassDisplay();
    }

}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer oc = new Outer();
        oc.display();
    }
}
