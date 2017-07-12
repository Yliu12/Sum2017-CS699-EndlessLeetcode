package bsu.edu.cs699.ying.medium;

/**
 * https://leetcode.com/problems/product-of-array-except-self/#/description
 * Created by yliu12 on 2017/7/11.
 * <p>
 * 17 / 17 test cases passed.
 * Status: Accepted
 * Runtime: 6 ms
 */
public class ProductofArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        Integer total = 1;
        boolean oneZero = false;
        boolean MoreZero = false;

        for (int i : nums) {
            if (oneZero && i == 0) {
                MoreZero = true;
                break;
            }

            if (i == 0) {
                oneZero = true;
                continue;
            }

            total *= i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (MoreZero) {
                nums[i] = 0;
                continue;
            }

            if (nums[i] == 0) {
                nums[i] = total;
                continue;
            } else if (oneZero) {
                nums[i] = 0;
                continue;
            }
            nums[i] = total / nums[i];
        }
        return nums;
    }
}
