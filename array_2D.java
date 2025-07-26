import java.util.*;

public class array_2D {
    public static void main(String[] args) {
        int number[][] = new int [3][4];
        int n = number.length, m = number[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                number[i][j]  = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(number[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
