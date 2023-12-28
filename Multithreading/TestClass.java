package Multithreading;



// crea a interface that acts as a interface and a trad  interface 
// 


class TheadInterface implements Runnable{
    public void run(){
        while(true){
            System.out.println("Hellow World");
        }
    }
}

public class TestClass {
    public static void main(String[] args) {
        TheadInterface myobj1 = new TheadInterface();
        Thread t1 = new Thread(myobj1);
        t1.start();
    }
}
