

public class recursion {
    public static void main(String[] args) {
       long ans = factorial(20);

        System.out.println(ans);
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

