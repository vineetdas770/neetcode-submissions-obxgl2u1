class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m*n -1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(target > matrix[mid/n][mid%n]){
                left = mid + 1;
            }else if(target < matrix[mid/n][mid%n]){
                right = mid - 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
