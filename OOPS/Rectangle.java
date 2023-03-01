package OOPS;

public class Rectangle {

    // define the properties
    private int length;
    private int breadth;

    // define the getter and setter methods
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // define the method of the rectangle

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public int isSqare() {
        if (length == breadth) {
            return 1;
        }
        return 0;
    }

}

class test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setBreadth(20);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSqare());
    }
}