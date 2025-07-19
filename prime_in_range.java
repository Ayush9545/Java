import java.util.*;

public class prime_in_range {

    public static boolean isprime(int a){
        if (a == 1) {
            return true;
        }
        for (int i = 2; i <= a-1; i++) {
            if (a % i== 0){
                return false;
            }
        }
        return true;
    }

    public static void range(int a){
        for (int i = 2; i <= a; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int no = s.nextInt();
        range(no);
    }
}
