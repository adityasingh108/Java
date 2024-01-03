import java.util.HashMap;
import java.util.Map;

public class WinnerCalculator {

    public static String[] winner(String[] arr, int n) {
        Map<String, Integer> mp = new HashMap<>();
        int max = 0;
        String s = "";

        // Count occurrences of each string in the array
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // Find the string with the maximum count
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                s = entry.getKey();
            }
        }

        // Create a string array and push the values of max and s
        String[] resultArray = {s, Integer.toString(max)};
        return resultArray;
    }

    public static void main(String[] args) {
        // Example usage
        String[] inputArray = {"john", "john", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};
        int arraySize = inputArray.length;
    
        String[] result = winner(inputArray, arraySize);
    
        // Print the result
        System.out.println("Winner: " + result[0]);
        System.out.println("Count: " + result[1]);
    }
    
}
