/**
 * Array Duplicates
 * Difficulty: Easy Accuracy: 18.95% Submissions: 814K+ Points: 2
 * Average Time: 20m
 * 
 * Given an array arr of integers, find all the elements that occur more than
 * once in the array. If no element repeats, return an empty array.
 * 
 * Examples:
 * Input: arr[] = [2, 3, 1, 2, 3]
 * Output: [2, 3]
 * Explanation: 2 and 3 occur more than once in the given array.
 * 
 * Input: arr[] = [0, 3, 1, 2]
 * Output: []
 * Explanation: There is no repeating element in the array, so the output is
 * empty.
 * 
 * Input: arr[] = [2]
 * Output: []
 * Explanation: There is single element in the array. Therefore output is empty.
 * 
 * Constraints:
 * 1 <= arr.size() <= 106
 * 0 <= arr[i] <= 106
 * 
 * Company Tags
 * Paytm Zoho Flipkart Amazon D-E-Shaw Qualcomm
 * 
 * Topic Tags
 * Array Data-Structure
 **/

 import java.util.ArrayList;

 class ArrayDuplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(i = 0; i < n; i++) {
            arr[arr[i]%n] += n;
        }
        
        for(i = 0; i < n; i++) {
            if(arr[i] >= 2*n)
                list.add(i);
        }
        
        if(list.isEmpty())
            list.add(-1);
        return list;
    }
}