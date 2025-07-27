public class transpose_matrix {

    public static void swap(int number[][]) {
        //int num[][] = new int[3][2];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                // int temp = number[0][j];
                // int temp2 = number[1][j];
                number[0][0]= number[0][0];
                number[1][0] = number[0][1];

                // number[1][j] = number[i][1];
                // number[i][j] = temp;
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void display(int number[][]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                System.out.print(number[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int marks[][] = { { 1, 2, 3 },
                { 4, 5, 6 } };

        swap(marks);
        //display(marks);
    }
}
