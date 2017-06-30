package bsu.edu.cs699.ying.easy;

/** https://leetcode.com/problems/construct-the-rectangle/#/description
 * Created by yliu12 on 6/30/2017.
 * 50 / 50 test cases passed.
 Status: Accepted
 Runtime: 5 ms
 */
public class ConstructtheRectangle {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int a = (int) Math.sqrt(area);
        while (area % a != 0) {
            a--;
        }
        result[1] = a;
        result[0] = area / a;
        return result;
    }
}
