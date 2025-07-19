import java.util.*;

public class mainprime_no {

    public static boolean isprime(int a){
        for (int i = 2; i <= a-1; i++) {
            if (a % i== 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int no = s.nextInt();
        System.out.println(isprime(no));
        }
}
