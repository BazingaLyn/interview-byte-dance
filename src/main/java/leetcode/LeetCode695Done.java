package leetcode;

public class LeetCode695Done {

    int[][]grid;
    int rows;
    int columns;
    int max=Integer.MIN_VALUE;
    int sum=0;

    public int maxAreaOfIsLand(int[][] grid){

        if(grid == null || grid.length == 0){
            return 0;
        }

        this.grid = grid;
        this.rows = grid.length;
        this.columns = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if(grid[i][j] == 1){
                    findArea(i,j);
                    max=Math.max(sum,max);
                    sum=0;
                }
            }
        }

        return max == Integer.MIN_VALUE ? 0 : max;
    }


    public void findArea(int i,int j){
        if(i < 0 || i >= rows || j >= columns || grid[i][j] == 0 || grid[i][j] == -1){
            return;
        }

        sum ++;
        grid[i][j] = -1;
        findArea(i-1,j);
        findArea(i +1,j);
        findArea(i,j+1);
        findArea(i,j-1);
    }
}
