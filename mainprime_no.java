import java.util.*;

public class mainprime_no {

    public static boolean isprime(int a){
        boolean isprime = true;
        for (int i = 2; i <= a-1; i++) {
            if (a % i== 0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int no = s.nextInt();
        System.out.println(isprime(no));
        }
}
