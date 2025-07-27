public class sprial {

    public static void d(int number[][]) {
        int s_row = 0;
        int e_row = number.length - 1;
        int s_col = 0;
        int e_col = number[0].length - 1;

        while (s_row <= e_row && s_col <= e_col) {
            // top
            for (int j = s_col; j <= e_col; j++) {
                System.out.print(number[s_row][j] + " ");
            }
            // right
            for (int i = s_row + 1; i <= e_row; i++) {
                System.out.print(number[i][e_col] + " ");
            }
            // bottom
            for (int j = e_col - 1; j >= s_col; j--) {
                System.out.print(number[e_row][j] + " ");
            }
            // left
            for (int i = e_row - 1; i > s_row ; i--) {
                System.out.print(number[i][s_col] + " ");
            }
            s_row++;
            e_row--;
            s_col++;
            e_col--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int marks[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 11, 12, 13, 14 },
                { 15, 16, 17, 18 } };
        d(marks);
    }
}
