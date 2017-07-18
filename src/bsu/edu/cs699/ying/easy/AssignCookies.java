package bsu.edu.cs699.ying.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/assign-cookies/#/description
 * Created by yliu12 on 7/3/2017.
 *21 / 21 test cases passed.
 Status: Accepted
 Runtime: 18 ms
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int contentChild = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int startSindex = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = startSindex; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    contentChild++;
                    startSindex = j+1;
                    break;
                }
                if (j == s.length - 1) {
                    return contentChild;
                }
            }
        }

        return contentChild;
    }

    public static void main(String[] args){
        AssignCookies ks = new AssignCookies();
        int[] g = {1,2,3};
        int[] s = {3};

        System.out.println(ks.findContentChildren(g,s));


    }
}
