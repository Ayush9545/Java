import java.util.*;

public class double_function {

    
    public static int fact(int f0 ){
        int f = 1;
        for (int i = 1; i <= f0; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bincoeff(int a, int b){
        int fc = fact(a);
        int fc2 = fact(b);
        int fc3 = fact(a-b);
        
        int bincoeff = fc / (fc2 * fc3);
        return bincoeff;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = s.nextInt();
        System.out.println("Enter the r : ");
        int r = s.nextInt();
        System.out.println(bincoeff(n, r));
    }
}
