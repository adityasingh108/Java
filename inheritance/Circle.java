package inheritance;

public class Circle {
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumfrence(){
        return perimeter();
    }

}
 // inheritence the circle class for the cylinder class
 class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area() * height;
    }
 }

  // create a main method to test the  inheritance

  class circle1{
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 7.2;
        c1.height = 10.5;
        System.out.println( "Volume of the Cylinder:"+c1.volume());
        System.out.println("Area of the Cylinder:"+c1.area());
        System.out.println(c1.perimeter());
    }
  }