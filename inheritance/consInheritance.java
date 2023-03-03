package inheritance;
class parent{
    public parent(){
        System.out.println("Parent class constructor");
    }
}


class child extends parent{
    public child(){
        System.out.println("Child class constructor");
    }
}


class GrandChild extends child{
    public GrandChild(){
        System.out.println("GrandChild class constructor");
    }
    void show(){
        System.out.println("GrandChild class method");
    }
}


class consInheritance{
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.show();
        
    }
}