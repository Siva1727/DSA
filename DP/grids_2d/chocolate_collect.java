public class chocolate_collect {
    public static void main(String[] args) {
        int grid[][] = {{3,1,1,},{2,5,1},{2,1,1}};
        int n = grid.length;
        int m = grid[0].length;
        System.out.println(solve(0,0,m-1,grid)); 
    }
    static int solve(int i , int j1, int j2,int[][]grid){
        
        if( j1< 0 || j1 >=grid[0].length || j2<0 || j2>=grid[0].length ){
            return -1000000000;
        }
        
        if(i == grid.length-1){
            if(j1 == j2){
                return grid[i][j1];
            }
            else{
                return grid[i][j1] + grid[i][j2];
            }
        }
        
        
        int maxi = Integer.MIN_VALUE;
        
        for(int di = -1;di < 2; di++){
            for(int dj = -1;dj < 2; dj++){
                int ans;
                if(j1 == j2){
                    ans = grid[i][j1] + solve(i+1,j1+di,j2+dj,grid);
                }
                else{
                    ans = grid[i][j1] +grid[i][j2] + solve(i+1,j1+di,j2+dj,grid);
                }
                maxi = Math.max(maxi , ans);
            }
        }
        return maxi;
    }
}
