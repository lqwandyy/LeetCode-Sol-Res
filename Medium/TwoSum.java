/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note
 * that your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have <strong>exactly one</strong> 
 * solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 
 * Tags: Array, HashTable
 */
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        // int[] numbers = {2, 7, 11, 15};
        // int target = 9;
        int[] numbers = {3, 2, 4}; // 6 = 3 + 3
        int target = 6;
        
        int[] res = twoSum(numbers, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ", ");
        }
    }

    /**
     * HashMap, key -> number, value -> index
     * can return index according to value
     * O(n) time, O(n) space
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) { // put all to map
            map.put(numbers[i], i);
        }
        
        for (int i = 0; i < numbers.length; i++) {
            int newTarget = target - numbers[i];
            // O(1) search
            if (map.containsKey(newTarget) && i != map.get(newTarget)) { // can't be same indices
                return new int[]{i + 1, map.get(newTarget) + 1};
            }
        }
        return null;
    }

}