public class Sudoku_Question {
    public static boolean SudokuSolver(int arr[][],int row,int col){
        // base case


        // recursion
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(arr[row][col != 0]){
            return sudokuSolver(arr,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(arr,row,col,digit)){
                arr[row][col]=digit;
                if(SudokuSolver(arr,nextRow,nextCol)){
                    return true;
                }
                arr[row][col]=0;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}};
    }
}
