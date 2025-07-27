public class diagonal_sum_matrix {

    public static int dia(int number[][]){
        int sum =0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                if (i == j) {
                    sum += number[i][j];
                }
                else if (i + j == number.length-1) {
                    sum +=number[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int marks[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(dia(marks));
    }
}
