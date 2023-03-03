package AbstractClass;


abstract class shape{
    abstract void area();
    abstract void perimeter();
}


// create a circle class  extending from the  shape class 


class circle extends shape{
    double radius;

    void circle(double radius){
        this.radius = radius;
    }

    void area(){
        double  are = Math.PI * radius*radius;
        System.out.println("area of the circle is :" + are);
    }
    void perimeter(){
        double per = Math.PI * radius;
        System.out.println("Perimeter of the circle  is : " + per);
    }

}


class rectangle extends shape{
        int length; 
        int breadth;

        void rectangle(int length , int breadth){
            this.length = length;
            this.breadth = breadth;
        }

        void area(){
            System.out.println("area of the rectangle is:" + length *breadth);
        }

        void perimeter(){
            System.out.println("Perimter of the rectangle is :"  + 2*( length + breadth ));
        }
}
public class shapeAbstract {
    public static void main(String[] args) {
        circle circle1 = new circle();
        circle1.radius = 5.4;
        circle1.area();
        circle1.perimeter();

        rectangle rectangle1 = new rectangle();
        rectangle1.length= 5;
        rectangle1.breadth = 6;
        rectangle1.area();
        rectangle1.perimeter();

    }
}

