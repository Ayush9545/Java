public class Recursion_fibonacci {

    public static int re(int a) {
        if (a == 1 || a == 0) {
            return a;
        }
        int f1 = re(a - 1);
        int f2 = re(a - 2);

        int f3 = f1 + f2;
        return f3;
    }

    public static void main(String[] args) {
        System.out.println(re(25));
    }
}
