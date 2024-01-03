import java.util.*;

public class recursion {
    public static void main(String[] args) {
    //    long ans = factorial(10);

       Date d = new Date(System.currentTimeMillis());
       GregorianCalendar cal = new GregorianCalendar();
       System.out.println(cal);
    //    System.out.println(d);

        // System.out.println(s);
    }

    public static long factorial(long n ){
        if(n < 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    // public static long factorial(long n ){
    //     long ans = 1;
    //     for(int i =1 ; i<n; i++)
    //     {
    //         ans *=i;
    //     }
    //     return ans;
    // }
}

