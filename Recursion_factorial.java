public class Recursion_factorial {

    public static int re(int a) {
        if (a == 0) {
            return 1;
        }
        int f1 = re(a - 1);
        int f2 = a * re(a - 1);
        return f2;
    }

    public static void main(String[] args) {
        System.out.println(re(5));
    }
}
