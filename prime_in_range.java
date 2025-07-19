import java.util.*;

public class prime_in_range {

    public static int range(int a){
        int j = 1;
        for (int i = 2; i <= a; i++) {
            if (i % 2 == 1) {
                return i;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int no = s.nextInt();
        System.out.println(range(no));
    }
}
