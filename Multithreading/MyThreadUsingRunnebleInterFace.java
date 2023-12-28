package Multithreading;

class MyThreadUsingRunnebleInterFace implements Runnable {
    public void run() {
        int i = 1;
        while (true){
            System.out.println( i + " Hello");
        }
    }

    public static void main(String[] args) {
        // create a  refrence of the MyThreadUsingRunnebleInterFace interface 
        MyThreadUsingRunnebleInterFace myinterfaceRefrence = new MyThreadUsingRunnebleInterFace();
        // create the object of the thread class  to achieve multithreading 
        Thread myThread = new Thread(myinterfaceRefrence);
        myThread.start();  // start the threading 


        int i = 1 ; 
        while(true){
            System.out.println( i + " World");
        }

    }
}
