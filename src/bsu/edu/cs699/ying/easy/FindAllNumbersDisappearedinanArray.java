package bsu.edu.cs699.ying.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/submissions/detail/107778555/
 * Created by yliu12 on 6/28/2017
 *34 / 34 test cases passed.
 Status: Accepted
 Runtime: 91 ms.
 */
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> numsSet = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(numsSet.contains(nums[i]))
                continue;
            numsSet.add(nums[i]);
        }

        int numsInSet =numsSet.size();
        for (int i=1;i<nums.length+1;i++){
            if(result.size()== nums.length-numsInSet){
                return result;
            }
            if(numsSet.add(i))
                result.add(i);
        }
        return result;
    }
}
