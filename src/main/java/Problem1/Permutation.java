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
        List<List<Integer>> n1 = new ArrayList<List<Integer>>();
        permuteHelper(nums, n1, 0);
        return n1;
    }

    private static void permuteHelper(int[] nums, List<List<Integer>> n1, int index) {
        if (index >= nums.length) {
            List<Integer> main = new ArrayList<Integer>();
            for (int i : nums) {
                main.add(i);
            }
            n1.add(main);
        }
        else {
            for (int i = index; i < nums.length; i++) {
                permuteSwapHelper(nums, index, i);
                permuteHelper(nums, n1, index + 1);
                permuteSwapHelper(nums, index, i);
            }
        }
    }

    private static void permuteSwapHelper(int[] nums, int n, int m) {
        int main = nums[n];
        nums[n] = nums[m];
        nums[m] = main;
    }
}
