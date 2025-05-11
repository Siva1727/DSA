package TwoDarrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = { {1, 2, 3}, {4, 5, 6} };
        int[][] B = { {1, 2}, {3, 4}, {5, 6} };
        int n = A.length;
        int m = B[0].length;
        int p = A[0].length;
        int[][] result = new int[n][m]; // 2x2 result

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

