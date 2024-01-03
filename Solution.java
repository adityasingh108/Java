import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static void main(String[] args) {


        
        Double ans = getDoubleAmount("Aditya");
        System.out.println(ans);


    }

    public static Double getDoubleAmount(String s){
        // Creating a HashMap
        Map<String, Double> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Aditya", 25.00);
        hashMap.put("Jane", 30.00);
        hashMap.put("Bob", 22.00);
        hashMap.put("Alice", 28.00);


        for (Map.Entry<String, Double> entry : hashMap.entrySet()){
            if(entry.getKey().equals(s)){
                return entry.getValue();
            }
        }
        return 0.00;
    }
}
