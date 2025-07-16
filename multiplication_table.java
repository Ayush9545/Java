import java.util.*;


public class multiplication_table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int t = s.nextInt();
        int m = 0;
        System.out.println("Multiplication of " + t + " is:");

        for (int i = 0; i <= 10; i++) {
            m = t * i;
            System.out.println(t + " * " + i + " = " + m);
        }
    }
}
