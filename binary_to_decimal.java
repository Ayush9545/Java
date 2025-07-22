public class binary_to_decimal {

    public static void btd(int a){
        int p = 0;
        int no = 0;

        while (a > 0) {
            int last = a % 10;
            no = no + (last * (int)Math.pow(2, p));

            p++;
            a = a/10;
        }
        System.out.println(no);
    }
    public static void main(String[] args) {
        btd(101);
    }
}
