package Multithreading;


/**
 * @author aditya 
 * create  mythred  that will print  1 hello  , 2 hello and so on .....
 * 
 */


class MyThread extends Thread{
    /**
     * this is the overided method of the Thread class 
     */
    public void run(){
        int i = 1;
        while(true){
            System.out.println( i + " Hello");
            i++;
        }
    }
}

public class OwnClassConvertInThread {
    public static void main(String[] args) {
        /**
         * create a object of the  Thred classs 
         * and run the object of the thread class 
         * using built in start() method 
         */
        MyThread t1 = new MyThread();
        t1.start();

        int i = 1;
        while(true){
            System.out.println( i + " World");
            i++;
        }
    }
}
