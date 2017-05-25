package bsu.edu.cs699.ying;

import java.util.ArrayList;
import java.util.List;

/**
 * Proble : https://leetcode.com/problems/fizz-buzz/#/description
 * FizzBuzz!!
 *
 * Created by yliu12 on 2017/5/25.
 *
 * RESULT
 8 / 8 test cases passed.
 Status: Accepted
 Runtime: 4 ms
 Submitted: 0 minutes ago

 beats 43.7% Java solution
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%15 ==0){
                result.add("FizzBuzz");
                continue;
            }
            if (i%3 == 0){
                result.add("Fizz");
                continue;
            }
            if (i%5 == 0){
                result.add("Buzz");
                continue;
            }
            result.add(i+"");

        }
        return result;
    }

    public static void main(String[] args){
        FizzBuzz ks = new FizzBuzz();
        System.out.println(ks.fizzBuzz(15));
    }



}
