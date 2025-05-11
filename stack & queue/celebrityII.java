public class celebrityII {
    public static void main(String[] args) {
        int matrix[][] = {{0,1,1,0} , {0,0,0,0} , {0,1,0,0} , {1,1,0,0}};
        int n = matrix.length;
        int [] IKnow = new int[n];
        int [] KnowMe = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 1){
                    IKnow[i]++;
                    KnowMe[j]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(IKnow[i] == 0 && KnowMe[i] == n-1){
                System.out.print(i);
            }
        }
    }
}
