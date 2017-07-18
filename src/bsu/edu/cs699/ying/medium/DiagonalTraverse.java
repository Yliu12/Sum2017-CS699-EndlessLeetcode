package bsu.edu.cs699.ying.medium;

/**
 * c
 * Created by yliu12 on 2017/7/17.
 * <p>
 * 32 / 32 test cases passed.
 * Status: Accepted
 * Runtime: 8 ms
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int rowCount = matrix.length;
        if (rowCount < 1) {
            return new int[0];
        }
        int colCount = matrix[0].length;


        int[] result = new int[colCount * rowCount];

        int resultIndex = 0;


        int col = 0;

        for (int sum = 0; sum < colCount + rowCount - 1; sum++) {

            if (col <= 0) {
                col = 0;

                col = sum - col >= rowCount ? sum - rowCount + 1 : col;

                while (col < colCount && col <= sum) {
                    result[resultIndex] = matrix[sum - col][col];
                    col++;
                    resultIndex++;
                }
            } else {
                col = col >= colCount - 1 ? colCount - 1 : col;
                col = sum - col >= rowCount - 1 ? sum - rowCount + 1 : col;


                while (col >= 0 && sum - col < rowCount) {
                    result[resultIndex] = matrix[sum - col][col];
                    col--;
                    resultIndex++;
                }
                col = 0;

            }
        }

        return result;
    }

    public static void main(String[] args) {
        DiagonalTraverse obj = new DiagonalTraverse();
        int[][] mat = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30}};
        obj.findDiagonalOrder(mat);
    }
}
