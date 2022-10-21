// Author: Jyotirmoy Avro

public class Problem120 {
    public static void main(String[] args) {
        int target = 0;
        int row = 3, col = 3;
        int[][] matrix = new int[row][col];
        for (int r = 0; r < row; r++)
            for (int c = 0; c < 3; c++)
                matrix[r][c] = (1 + r * 3 + c);

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(matrix[r][c] + " ");
                if (c == 2)
                    System.out.println();
            }
        }

        System.out.print(Boolean.toString(searchMatrix(matrix, target)));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        
        int lower = 0;
        int higher = m * n - 1;
        
        while (lower <= higher) {
            int mid = (lower + higher) >> 1;
            int val = matrix[mid / n][mid % n];
            if (val == target) return true;
            if (val < target) lower = mid + 1;
            else higher = mid - 1;
        }
        return false;
    }
}