public class celebrityOptimal {
    public static void main(String[] args) {
        int matrix[][]= { {0}};
        int n = matrix.length;
        int top = 0;
        int down = n-1;
        while(top < down){
            if(matrix[top][down] == 1){
                top++;
            }
            else{
                down--;
            }
        }
        int candidate = top;
        boolean isCelebrity = true;
        for(int i=0;i<n;i++){
            if(i != candidate){
                if(matrix[candidate][i] == 1 || matrix[i][candidate] == 0){
                    isCelebrity = false;
                } 
            }
        }
        if(isCelebrity){
            System.out.println(candidate);
        }
        else System.out.println(-1);
    }
    
}
