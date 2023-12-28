// this is the control flow pf the java program 

// now i want to convert the program to execute the  simeltaneously 

// it should print like this 
// 1 hello 1 world

package Multithreading;
class ControlFlow{

    static void display(){
        int i = 1;
        while(true){
            System.out.println( i + " Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        // display();

        int i = 1;
        while(true){
            System.out.println( i + " World");
            i++;
        }
    }
}