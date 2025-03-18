import java.util.ArrayList;

/**
 * Missing And Repeating
 * Difficulty: Easy Accuracy: 24.83% Submissions: 574K+ Points: 2 Average Time:
 * 30m
 * 
 * Given an unsorted array arr of positive integers. One number a from the set
 * [1, 2,....,n] is missing and one number b occurs twice in the array. Find
 * numbers a and b.
 * 
 * Note: The test cases are generated such that there always exists one missing
 * and one repeating number within the range [1,n].
 * 
 * Examples:
 * Input: arr[] = [2, 2]
 * Output: [2, 1]
 * Explanation: Repeating number is 2 and smallest positive missing number is 1.
 * 
 * Input: arr[] = [1, 3, 3]
 * Output: [3, 2]
 * Explanation: Repeating number is 3 and smallest positive missing number is 2.
 * 
 * Input: arr[] = [4, 3, 6, 2, 1, 1]
 * Output: [1, 5]
 * Explanation: Repeating number is 1 and the missing number is 5.
 * 
 * Constraints:
 * 2 ≤ arr.size() ≤ 106
 * 1 ≤ arr[i] ≤ arr.size()
 * 
 * Topic Tags
 * Arrays
 * 
 */

public class MissingAndRepeating {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        for (int i = 0; i < n; i++)
            arr[(arr[i] - 1) % n] += n;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(0);
        for (int i = 0; i < n; i++) {
            // System.out.println(arr[i]);
            if ((arr[i] - 1) / n >= 2)
                numbers.set(0, i + 1);
            else if (arr[i] <= n)
                numbers.set(1, i + 1);
        }

        return numbers;
    }
}
