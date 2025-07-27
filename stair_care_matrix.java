public class stair_care_matrix {

    public static boolean mat(int number[][], int key) {
        int row = 0, col = number[0].length - 1;

        while (row < number.length && col >= 0) {
            if (number[row][col] == key) {
                System.out.println(row + " " + col);
                return true;
            } else if (key < number[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int marks[][] = { { 1, 2, 3, 4 },
                { 45, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int key = 15;
        mat(marks, key);

    }
}
