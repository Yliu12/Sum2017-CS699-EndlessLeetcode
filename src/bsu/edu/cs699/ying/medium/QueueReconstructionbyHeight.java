package bsu.edu.cs699.ying.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/queue-reconstruction-by-height/#/description
 * Created by yliu12 on 6/27/2017.
 *37 / 37 test cases passed.
 Status: Accepted
 Runtime: 158 ms
 */
public class QueueReconstructionbyHeight {
    public int[][] reconstructQueue(int[][] people) {
        int[][] resut = new int[people.length][2];
        ArrayList<int[]> resultList = new ArrayList<>();

        Map<Integer,ArrayList> peopleMap = new HashMap<>();
        for ( int[] person :people){
                peopleMap.putIfAbsent(person[1], new ArrayList());
                peopleMap.get(person[1]).add(person[0]);
        }
        List<Integer> peopleMapKey = new ArrayList(peopleMap.keySet());
        Collections.sort(peopleMapKey);


        for(int index:peopleMapKey){
            ArrayList<Integer> peopleHight =  peopleMap.get(index);
             Collections.sort( peopleHight);



            for(int height :peopleHight){
                 int peopleTallerinfront = index;
                 int toAddIndex =0;

                 for (int i=0;i<resultList.size();i++) {
                     if ( peopleTallerinfront != 0 && resultList.get(i)[0]>= height) {
                         peopleTallerinfront--;
                         toAddIndex = i+1;
                     }else
                     if ( peopleTallerinfront == 0 && resultList.get(i)[0] <height){
                         toAddIndex = i+1;
                     }
                     else if ( peopleTallerinfront == 0 && resultList.get(i)[0] >=height){
                         toAddIndex = i;
                         break;
                     }
                 }
                int[] tmp = {height,index};
                 if(toAddIndex<resultList.size()){
                     resultList.add(toAddIndex,tmp);

                 }else{
                     resultList.add(tmp);
                 }
             }






        }
        resut = resultList.toArray(resut);
        return resut;
    }
    public static void main(String[] args){
        QueueReconstructionbyHeight ks = new QueueReconstructionbyHeight();
        int[][] people = {{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        System.out.println(ks.reconstructQueue(people));


    }
}
