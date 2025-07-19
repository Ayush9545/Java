import java.util.*;

public class factorial_of_no {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = s.nextInt();
        int f = 1;

        if (no == 1 || no == 0) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= no; i++) {
                f = f * i;

            }

            System.out.println(f);
        }
    }
}