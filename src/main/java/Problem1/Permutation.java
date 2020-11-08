package Problem1;

import java.util.ArrayList;
import java.util.List;

/*
This site was used as help in this code:
https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
https://www.programcreek.com/2013/02/leetcode-permutations-java/
*/

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        //Creates a new empty Integer ArrayList
        List<List<Integer>> n1 = new ArrayList<List<Integer>>();
        permuteHelper(nums, n1, 0);
        //returns the n1 ArrayList
        return n1;
    }

    private static void permuteHelper(int[] nums, List<List<Integer>> n1, int index) {
        if (index >= nums.length) {
            List<Integer> main = new ArrayList<Integer>();
            //Adds values from nums array to main ArrayList
            for (int i = 0; i < nums.length; i++) {
                main.add(nums[i]);
            }
            //Adds values from main to n1 ArrayList
            n1.add(main);
        }
        else {
            //Used to swap values and call back to the helper function increasing the index
            for (int i = index; i < nums.length; i++) {
                int s1 = nums[index];
                nums[index] = nums[i];
                nums[i] = s1;
                permuteHelper(nums, n1, index + 1);
                int s2 = nums[index];
                nums[index] = nums[i];
                nums[i] = s2;
            }
        }
    }
}
