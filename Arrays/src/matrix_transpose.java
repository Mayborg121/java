
public class matrix_transpose {
    public static void main(String[] args) {
      int[][] arr = {
              {3, 5, 6},
              {9,12,15},
              {2, 4, 8}
      };

      transpose(arr);
    }

    public static int[][] transpose(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] transposed = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                transposed[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++){
            for(int j = transposed[0].length - 1; j >= 0; j--){
                System.out.print(transposed[i][j] + ", ");
            }
            System.out.println();
        }
        for (int i = matrix[0].length - 1; i >= 0; i--){
            for(int j = matrix[0].length - 1; j >= 0; j--){
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
        return transposed;
    }
}