package bsu.edu.cs699.ying.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yliu12 on 6/28/2017.
 */
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> numsList = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(numsList.contains(nums[i]))
                continue;
            numsList.add(nums[i]);
        }

        for (int i=1;i<nums.length+1;i++){
            if(numsList.contains(i))
                continue;
            result.add(i);

        }
        return result;
    }
}
