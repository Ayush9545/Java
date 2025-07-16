import java.util.*;

public class naturalnosun {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the no: ");
        int n = s.nextInt();
        // System.out.println("Enter the no: ");

        int sum = 0;
        int i = 0;
        while (i<=n) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum );
    }
}
