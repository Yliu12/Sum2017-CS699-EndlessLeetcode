package bsu.edu.cs699.ying.easy;

/**
 * Proble :https://leetcode.com/problems/island-perimeter/#/description
 * Created by yliu12 on 6/27/2017.
 5833 / 5833 test cases passed.
 Status: Accepted
 Runtime: 163 ms
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int island = 0;
        int neighbour = 0;
        for (int r = 0;r<grid.length;r++){
            for (int c = 0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    island++;
                    if(r+1<grid.length){
                        if(grid[r+1][c]==1)
                            neighbour++;
                    }
                    if(c+1<grid[0].length){
                        if(grid[r][c+1]==1)
                            neighbour++;
                    }
                }

            }
        }
        return island*4-neighbour*2;
    }
}
