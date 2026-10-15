class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //brute force
        // int row = 0;
        // int col = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
