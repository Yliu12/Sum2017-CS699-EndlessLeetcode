package bsu.edu.cs699.ying;

import bsu.edu.cs699.nan.TemplateClass;



import java.util.*;

/**
 * Proble : Distribute Candies  https://leetcode.com/problems/distribute-candies/#/description
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies.
 * Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister.
 * Return the maximum number of kinds of candies the sister could gain.
 *
 * Created by yliu12 on 2017/5/25.
 *
 207 / 207 test cases passed.
 Status: Accepted
 Runtime: 134 ms

 beats 25.6% Java solution


 NOTE:

 to Set Solution

 https://leetcode.com/problems/distribute-candies/#/solutions

 */
public class DistributeCandies{
    public int distributeCandies(int[] candies) {




        Set<Integer> resultSet= new HashSet<>();
        for(int i=0;i<candies.length;i++){
            resultSet.add(i);

        }


        if(resultSet.size()>(candies.length/2)){
            return candies.length/2;
        }
        return resultSet.size();
    }
    public static void main(String[] args){
        //TestCode here
        DistributeCandies ks = new DistributeCandies();
        int[] list = {1,1,2,2,3,3};
        System.out.println(ks.distributeCandies(list));
    }
}
