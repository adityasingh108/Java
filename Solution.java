import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int row = sc.nextInt();
        int i , j , k = 1;
        for( i = 1; i<= (2 * row ) -1 ;  i++){
            for(j = 1 ; j<= (2 *row )-1 ; j++){
                if(i== j  || i+j == 2 *row){
                    System.out.println(k);
                } 
                else{
                    System.out.println(" ");
                }

            }
            if( i < row){
                k++;
            }
            else{
                k--;

            }
            System.out.println();
        }

    }
}
