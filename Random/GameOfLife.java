import java.util.*;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        GameOfLife(board);
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    public static void GameOfLife(int[][] board) {
        int tp[][]=new int[board.length][board[0].length];
        int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                int liv = 0;
                
                for (int k = 0; k < 8; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    
                    if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 1) {
                        liv++;
                    }
                }
                if(board[i][j]==1 && liv<2)
                {
                    tp[i][j]=0;
                }
                else if(board[i][j]==1 && liv==2 || liv==3)
                {
                   tp[i][j]=1;
                }
                else if(board[i][j]==1 && liv>3)
                {
                    tp[i][j]=0;
                }
                else if(board[i][j]==0 && liv==3)
                {
                    tp[i][j]=1;
                }
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j]=tp[i][j];
            }
        }
    }
}
