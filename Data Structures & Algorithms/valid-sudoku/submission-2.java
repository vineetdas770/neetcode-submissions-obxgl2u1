class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> s = new HashSet<>();

        for(int row = 0 ; row<9 ; row++){
            for(int col = 0; col<9 ; col++){
                if(board[row][col]=='.') continue;
                String row_string = "Value" + board[row][col] + "in" + "Row" + row;
                String col_string = "Value" + board[row][col] + "in" + "Col" + col;
                String box_string = "Value" + board[row][col] + "in" + "Box" + row/3 + "and" + col/3;

                if(s.contains(row_string) || s.contains(col_string) || s.contains(box_string)){
                    return false;
                }
                s.add(row_string);
                s.add(col_string);
                s.add(box_string);

            }
        }
        return true;
    }
}
