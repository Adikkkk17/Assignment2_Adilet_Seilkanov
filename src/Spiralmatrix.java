public class Spiralmatrix {

        public static void main(String[] args) {
            int N = 3;
            int[][] matrix = new int[N][N];
            Spiral(matrix, 0, 0, N, 1);
            printMatrix(matrix);
        }

        public static void Spiral(int[][] matrix, int row, int col, int size, int num) {
            if (size <= 0) {
                return;
            }

            for (int i = 0; i < size; i++) {
                matrix[row][col + i] = num++;
            }

            for (int i = 1; i < size; i++) {
                matrix[row + i][col + size - 1] = num++;
            }

            for (int i = size - 2; i >= 0; i--) {
                matrix[row + size - 1][col + i] = num++;
            }

            for (int i = size - 2; i > 0; i--) {
                matrix[row + i][col] = num++;
            }

            Spiral(matrix, row + 1, col + 1, size - 2, num);
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

