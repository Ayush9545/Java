public class count_of_no_in_matrix {
    public static int repeat(int number[][],int key){
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                if (number[i][j]== 7) {
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int marks[][] = { { 1, 2, 3, 4 },
                { 45, 6, 7, 8 },
                { 9, 7, 11, 12 },
                { 13, 14, 7, 16 } };
        int key = 15;
        System.out.println(repeat(marks, key));
    }
}
