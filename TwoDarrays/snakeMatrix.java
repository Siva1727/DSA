package TwoDarrays;

public class snakeMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print((i%2 == 0) ? arr[i][j]+" " : arr[i][m-j-1]+" ");
            }
            System.out.println();
        }
    }
}
