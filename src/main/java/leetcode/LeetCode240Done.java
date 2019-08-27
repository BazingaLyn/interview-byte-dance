package leetcode;


/**
 *
 */
public class LeetCode240Done {




    //practise
    public boolean searchMatrix(int[][] matrix,int target){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int beginRow = 0;
        int beginCol = cols - 1;
        while(beginRow < rows && beginCol >= 0){

            if(matrix[beginRow][beginCol] == target){
                return true;
            }else if(matrix[beginRow][beginCol] < target){
                beginRow ++;
            }else{
                beginCol --;
            }

        }

        return false;
    }






//    public boolean searchMatrix(int[][] matrix,int target){
//        if(matrix == null || matrix.length < 1 ||matrix[0].length < 1){
//            return false;
//        }
//        int row = 0;
//        int col = matrix[0].length - 1;
//        while(row < matrix.length && col >= 0){
//            if(matrix[row][col] < target){
//                row ++;
//            }else if(matrix[row][col] > target){
//                col--;
//            }else{
//                return true;
//            }
//        }
//
//
//        return false;
//    }
}
