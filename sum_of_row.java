public class sum_of_row {

    public static int summ(int number[][]){
        int sum = 0;
        //for (int i = 0; i < number.length; i++) ====>>>> NO NEED OF THIS
            for (int j = 0; j < number[0].length; j++) {
                //if (i == 1) =====>>>>> NO NEED OF THIS TOO
                    sum += number[1][j];
            }
        return sum;
    }
    public static void main(String[] args) {
        int marks[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(summ(marks));
    }
}
