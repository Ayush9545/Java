public class Recursion_decending {

    public static void re(int a) {
        if (a == 1) {
            System.out.println("1");
            return;
        }
        System.out.print(a + " ");
        re(a - 1);
    }

    public static void main(String[] args) {
        re(10);
    }
}
