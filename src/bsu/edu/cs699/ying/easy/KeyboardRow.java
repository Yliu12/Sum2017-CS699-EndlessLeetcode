package bsu.edu.cs699.ying.easy;

import java.util.ArrayList;

/**
 * Proble : https://leetcode.com/problems/keyboard-row/#/description
 *
 *Given a List of words, return the words that can be
 * typed using letters of alphabet on only one row's of American keyboard.
 *
 * Created by yliu12 on 2017/5/24.
 *
 *  81 / 81 test cases passed.
 22 / 22 test cases passed.
 Status: Accepted
 Runtime: 4 ms
 beats 67.24% Java solution
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String line1 = "qwertyuiopQWERTYUIOP";
        String line2 = "asdfghjklASDFGHJKL";
        String line3 = "zxcvbnmZXCVBNM";

        ArrayList<String> resultList = new ArrayList<>();


        for (String word : words){

            boolean oneLineFlag = true;
            char[] chars = word.toCharArray();
            String possibleLine = line1;
            String firstCharactor = word.substring(0,1);

            if(line2.contains(firstCharactor)){
                possibleLine = line2;
            }else
            if(line3.contains(firstCharactor)){
                possibleLine = line3;
            }

            for (int i=1;i<chars.length; i++){
                if(!possibleLine.contains(chars[i]+"")){
                    oneLineFlag = false;
                    break;
                }
            }

            if(oneLineFlag){
                resultList.add(word);
            }
        }
        String[] result = new String[resultList.size()];
        return resultList.toArray(result);
    }
    public static void main(String[] args){
        KeyboardRow ks = new KeyboardRow();
        String[] s = {"qwee"};
        System.out.println(ks.findWords(s));
    }

}
