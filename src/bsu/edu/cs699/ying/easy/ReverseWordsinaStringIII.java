package bsu.edu.cs699.ying.easy;

/**
 * [Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/#/description)
 * Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"

 * Created by yliu12 on 2017/5/26.
 *
 *30 / 30 test cases passed.
 Status: Accepted
 Runtime: 18 ms
 Beats 53.19
 */
public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] wordArray= s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : wordArray){
            sb.append(new StringBuilder(word).reverse()+" ");
        }

    return sb.toString().trim();
    }

}
