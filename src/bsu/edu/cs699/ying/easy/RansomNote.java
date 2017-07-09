package bsu.edu.cs699.ying.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/ransom-note/#/description
 * Created by yliu12 on 2017/7/5.
 * 126 / 126 test cases passed.
 Status: Accepted
 Runtime: 83 ms
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();

        for(char c :magazineChars){
            if (null !=charMap.putIfAbsent(c,1))
                charMap.put(c,charMap.get(c)+1);
        }
        for(char c :ransomNoteChars){
            if (null ==charMap.get(c)||charMap.get(c) ==0)
                return false;
            charMap.put(c,charMap.get(c)-1);
        }

        return true;
    }
    public static void main(String[] args){
        RansomNote ks = new RansomNote();
        System.out.println(ks.canConstruct("aa","aab"));


    }
}
