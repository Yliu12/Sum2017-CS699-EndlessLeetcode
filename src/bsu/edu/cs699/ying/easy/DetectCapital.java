package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/detect-capital/#/description
 * Created by yliu12 on 6/28/2017.
 * 550 / 550 test cases passed.
 Status: Accepted
 Runtime: 49 ms
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        return word.matches("[A-Z][a-z]+|[A-Z]+|[a-z]+");
    }
}
