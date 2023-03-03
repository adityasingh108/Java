package Interfaces;


interface testInterface{ // only created for the achivenig the run time polymorphism
    // interfaces has abstract methid and the class
    public void meth1();
    public void meth2();
}


class myClass implements testInterface{

    public void meth1(){
        System.out.println("MyClass method1 is called ");
    }
    public void meth2(){
        System.out.println("MyClass method2 is called ");
    }
    void meth3(){
        System.out.println("MyClass method3 is called ");
    }
}



class praticeInterface{
    public static void main(String[] args) {
       testInterface ti1= new myClass();  // achive dynamic method dispatching and the runtime polymorphisms
       ti1.meth1();
       ti1.meth2();


       myClass myClassObj1 = new myClass();
       myClassObj1.meth1();
       myClassObj1.meth2();
       myClassObj1.meth3();
    }
}