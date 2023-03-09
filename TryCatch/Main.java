class Main{
    public static void main(String[] args) {
        int arr[] = {1,0,3,4,5};
        try{
            double c = arr[0] / arr[3];
        System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("denominator sould not be 0 while divideing" );
        }
        try{

            System.out.println("Hello World" + arr[2]);
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }   

    }
}