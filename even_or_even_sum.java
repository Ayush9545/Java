import java.util.*;

public class even_or_even_sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        int b;
        int evensum = 0;
        int oddsum = 0;

       do {
        System.out.println("Enter the no: ");
        a = s.nextInt();
        if (a%2 == 0) {
            evensum += a;
        } else {
            oddsum += a;
        }
        System.out.println("Do you want to continew? If yes type 1 or if no type 0");
        b = s.nextInt();
       } while (b == 1);

       System.out.println(evensum);
       System.out.println(oddsum);
    }
}
