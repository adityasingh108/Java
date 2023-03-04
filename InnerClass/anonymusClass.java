package InnerClass;

//  anonymus claass is useful for creating the object of the abstract class and  the interfaces

abstract class My{
    abstract public  void show(); // this mwthod will override inside the anonymus class
}


class Outer{
    public void display(){
        My outeronject = new My(){
            public void show(){
                System.out.println("Im anonymous class "); // 
            }
        };
        outeronject.show();
    }
}



public class anonymusClass {
    public static void main(String[] args) {
        Outer ou = new Outer(); 
        ou.display();
    }
}
