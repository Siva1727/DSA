package TwoDarrays;

public class saddlepoint {
    public static void main(String[] args) {
        int arr[][]= {{3,1,9},{2,8,7},{4,6,5}};
        boolean found = false;
        for(int i = 0;i<arr.length;i++){
            int min = arr[i][0];
            int colind = 0;
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                    colind = j;
                }
            }
            boolean isSaddle = true;
            for(int k=0;k<arr.length;k++){
                if(arr[k][colind] > min){
                    isSaddle = false ;
                    break;
                }
            }
            if(isSaddle){
                System.out.println("Saddle point is : "+min);
                found = true;
                // break ;
            }
        }
        if(!found)System.out.println("No saddle point");
    }
}
