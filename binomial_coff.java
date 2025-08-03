import java.util.*;

public class binomial_coff {

    public static int binomial(int a){
        int f = 1;

        if (a == 1 || a == 0) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= a; i++) {
                f = f * i;
            }
        }
        return f;
    }

    public static int sum(int n, int r){
        int up =binomial(n);
        int down = binomial(r);
        int diff = binomial(n-r);
        int total = up / (down * diff);

        return total;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = s.nextInt();
        System.out.println("Enter the r");
        int r = s.nextInt();
        System.out.println(sum(n, r));
    }
}
