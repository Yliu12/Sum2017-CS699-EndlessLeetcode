package bsu.edu.cs699.ying.easy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * 17 / 17 test cases passed.
 Status: Accepted
 Runtime: 96 ms
 1.72%
 * Created by yliu12 on 2017/5/26.
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        List<Integer> numsArray = IntStream.of( nums ).boxed().collect( Collectors.toList() );


        for(int i=0;i<findNums.length;i++){
            int num = findNums[i];

            int IndexOfNum = numsArray.indexOf(findNums[i]);
           for(int j = IndexOfNum;j<nums.length;j++){
               if(nums[j] > findNums[i]){
                   findNums[i] = nums[j];
                   break;
               }
           }
            findNums[i] = findNums[i] == num? -1:findNums[i];



        }

        return findNums;
    }

    public static void main(String[] args){
        NextGreaterElementI ks = new NextGreaterElementI();
        System.out.println(ks.nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2}));
    }



}
