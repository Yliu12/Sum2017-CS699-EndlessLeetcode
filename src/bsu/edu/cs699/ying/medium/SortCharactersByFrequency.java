package bsu.edu.cs699.ying.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/sort-characters-by-frequency/#/solutions
 * Created by yliu12 on 2017/7/6.
 *35 / 35 test cases passed.
 Status: Accepted
 Runtime: 55 ms
 */
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        char[] sChars = s.toCharArray();
        Map<Character,Integer> freqMap = new TreeMap<>();
        for(char c :sChars){
            if(null != freqMap.putIfAbsent(c,1)){
                freqMap.put(c,freqMap.get(c)+1);
            }
        }

        Comparator<Map.Entry<Character, Integer>> valueComparator = new Comparator<Map.Entry<Character,Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                // TODO Auto-generated method stub
                return o2.getValue()-o1.getValue();
            }
        };

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());

        // 排序
        Collections.sort(list,valueComparator);

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            int i = 0;
            while(i<entry.getValue()) {
                result.append(entry.getKey());
                i++;
            }
        }

        return result.toString();



    }
}
