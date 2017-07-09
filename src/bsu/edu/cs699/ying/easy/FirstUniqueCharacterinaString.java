package bsu.edu.cs699.ying.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/#/description
 * Created by yliu12 on 2017/7/8.
 * <p>
 * 104 / 104 test cases passed.
 * Status: Accepted
 * Runtime: 33 ms
 */
public class FirstUniqueCharacterinaString {
  /*  public int firstUniqChar(String s) {
        if (s.length() == 1)
            return 0;

        List<Character> charList = new ArrayList<>();
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
          charList.add(sChars[i]);
        }

        for (int i = 0; i < sChars.length; i++) {
            charList.remove(charList.indexOf(sChars[i]));
           if(!charList.contains(sChars[i])){
               return i;
           }
           charList.add(sChars[i]);
        }
        return -1;
    }*/

    public int firstUniqChar(String s) {

        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (s.indexOf(a[i]) == s.lastIndexOf(a[i])) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        FirstUniqueCharacterinaString fu = new FirstUniqueCharacterinaString();
        fu.firstUniqChar("dddccdbba");
    }
}
