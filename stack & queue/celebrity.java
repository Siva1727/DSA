class celebrity{
    public static void main(String[] args) {
        int matrix[][] = {{0,1,1,0} , {0,0,0,0} , {0,1,0,0} , {1,1,0,0}};
        int n = matrix.length;
        for(int i=0;i<n;i++){
            boolean isCelebrity = true;
            for(int j=0;j<n;j++){
                if(i != j){
                    if(matrix[i][j] == 1 || matrix[j][i] == 0){
                        isCelebrity = false;
                        break;
                    }
                }
            }
            if(isCelebrity){
                System.out.println(i);
            }
        }

    }
}