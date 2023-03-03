package inheritance;

class rectangle{
    int length;
    int breadth;

    // create a constructor for the class non parameter constructor
    public rectangle(){
        length = 0;
        breadth = 0;

    }
    // create a parameter constructor
    public rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    // create a method to calculate the area
    public int area(){
        return length * breadth;
    }
    // create a method to calculate the perimeter
    public int perimeter(){
        return 2 * (length + breadth);
    }
}

class cubeoid extends rectangle{
    int height;
    // create a constructor for the class non parameter constructor
    public cubeoid(){
        height = 0;
    }
    // create a parameter constructor
    public cubeoid(int l, int b, int h){
        super(l, b); // super keyword is used to call the parent class constructor
        height = h;
    }
    // create a method to calculate the volume
    public int volume(){
        return length * breadth * height;
    }
    
}


public class paremeterConstrucrtot {
    public static void main(String[] args) {
        cubeoid c1 = new cubeoid(10, 20, 30);
        System.out.println("The area of the rectangle is: " + c1.area());
        System.out.println("The perimeter of the rectangle is: " + c1.perimeter());
        System.out.println("The volume of the cubeoid is: " + c1.volume());
        
    }
}
