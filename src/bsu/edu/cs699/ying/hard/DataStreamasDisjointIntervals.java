package bsu.edu.cs699.ying.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/data-stream-as-disjoint-intervals/#/description
 * Created by yliu12 on 2017/7/2.
 * 9 / 9 test cases passed.
 Status: Accepted
 Runtime: 183 ms
 * refered : https://leetcode.com/problems/data-stream-as-disjoint-intervals/#/solutions
 */
public class DataStreamasDisjointIntervals {
    /**
     * Initialize your data structure here.
     */

    TreeMap<Integer, Interval> tree;

    public DataStreamasDisjointIntervals() {
        tree = new TreeMap<>();
    }

    public void addNum(int val) {
        if(tree.containsKey(val)){
            return;
        }


        Integer lk = tree.lowerKey(val);
        Integer hk = tree.higherKey(val);

        if(lk!= null && tree.get(lk).end >= val){
            return;
        }
        if(hk!= null && tree.get(hk).start <= val){
            return;
        }

        if( lk!= null && hk!= null && tree.get(lk).end == val-1 && tree.get(hk).start==val+1){
            tree.get(lk).end = tree.get(hk).end;
            tree.remove(hk);
        }else if(lk!= null && tree.get(lk).end == val-1){
            tree.get(lk).end = val;
        }else if(hk!= null&&tree.get(hk).start==val+1){
            tree.get(hk).start = val;
        }else{
            tree.put(val,new Interval(val,val));
        }

    }

    public List<Interval> getIntervals() {
        return new ArrayList<>(tree.values());

    }


    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

}
