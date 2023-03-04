package InnerClass;

class StaticInnnerClasss {
    int x = 5;
    static int y = 6;

    static class My {
        public void show() {
            // only access the static propty of the outer class
            System.out.println("Static member of the outer class is :" + y);
        }
    }
}

public class staticInnerClass {
    public static void main(String[] args) {
        StaticInnnerClasss.My obj = new StaticInnnerClasss.My(); // create object of the static inner class
        obj.show();
    }
}
