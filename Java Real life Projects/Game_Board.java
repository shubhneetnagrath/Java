/*
Scenario
>Represent a chess or tic-tac-toe board.
 */
public class Game_Board{
    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'X'}
        };
    for(int row = 0;row < board.length;row++){
        for(int col =0;col < board[row].length;col++){
           
            System.out.print(board[row][col] + " ");
        }
        System.out.println();
    }         
    }
}  

/*
Concepts
>Matrix traversal
>Grid-based games
>Foundation for path-finding algorithms

*/