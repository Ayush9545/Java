public class Recursion_increasing {

    public static void re(int a) {
        if (a == 1) {
            System.out.print("1 ");
            return;
        }
        re(a - 1);
        System.out.print(a + " ");

    }

    public static void main(String[] args) {
        re(10);
    }
}
