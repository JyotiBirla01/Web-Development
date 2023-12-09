import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int curr = 1;
        while (curr <= n * n) {
            // top row --> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {
                matrix[topRow][j] = curr++;
                // System.out.print(matrix[topRow][j]);
            }
            topRow++;

            // right column --> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                matrix[i][rightCol] = curr++;
                // System.out.print(matrix[i][rightCol]);
            }
            rightCol--;

            // bottomRow --->right to left
            for (int j = rightCol; j >= leftCol && curr <= n * n; j--) {
                matrix[bottomRow][j] = curr++;
                // System.out.print(matrix[bottomRow][j] + " ");
            }
            bottomRow--;

            // leftCol --> bottomRow to TopRow
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                matrix[i][leftCol] = curr++;
                // System.out.print(matrix[i][leftCol]);
            }
            leftCol++;

        }
        // System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
