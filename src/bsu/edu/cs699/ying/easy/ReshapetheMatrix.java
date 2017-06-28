package bsu.edu.cs699.ying.easy;

/**
 * Proble :https://leetcode.com/problems/reshape-the-matrix/#/description
 * Created by yliu12 on 6/27/2017.
 * <p>
 * 56 / 56 test cases passed.
 * Status: Accepted
 * Runtime: 13 ms
 */
public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] resultMatrix = new int[r][c];
        int oriR = nums.length;
        int oriC = nums[0].length;

        int oriTotal = oriR * oriC;

        if (r * c != oriTotal) {
            return nums;
        }

        for (int i = 0; i < oriTotal; i++) {
            int curRow = i / oriC;
            int curCol = i % oriC;


            int destRow = i / c;
            int destCol = i % c;

            resultMatrix[destRow][destCol] = nums[curRow][curCol];

        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        ReshapetheMatrix ks = new ReshapetheMatrix();
        int[][] martix = {{1}, {2}, {3}, {4}};
        System.out.println(ks.matrixReshape(martix, 2, 2));
    }
}
