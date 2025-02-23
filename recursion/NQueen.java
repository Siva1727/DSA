import java.util.*;
// optimal :
public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String str = "-".repeat(n);
        for(int i=0;i<n;i++){
            board.add(str);
        }
        int [] left = new int[n];
        int [] lower = new int [2 * n -1];
        int [] upper = new int [2 * n -1];
        solve(0,board,ans,left,lower,upper,n);
        System.out.print(ans);
    } 
    static void solve(int col ,List<String> board, List<List<String>> ans,int [] left,int [] lower, int [] upper,int n){
        if( col == n){
            ans.add(new ArrayList(board));
            return ;
        }
        for(int row = 0 ;row <n ; row++){
            if(left[row] == 0 && lower[row+col] == 0 && upper[n-1 + col-row] == 0){
                char [] boardRow = board.get(row).toCharArray();
                boardRow[col] ='Q';
                board.set(row , new String(boardRow));

                left[row] = 1;
                lower[row+col] = 1;
                upper[n-1 + col-row] = 1;

                solve(col+1,board,ans,left,lower,upper,n);

                boardRow[col] ='-';
                board.set(row , new String(boardRow));

                left[row] = 0;
                lower[row+col] = 0;
                upper[n-1 + col-row] = 0;
            }
        }
    }
}
