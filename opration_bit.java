public class opration_bit {

    public static int get_no(int n, int i) {
        int bit = 1 << i;
        if ((n & bit) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int set_no(int n , int i){
        int bit = 1<<i;
        return n|bit;
    }

    public static void main(String[] args) {
        System.out.println(get_no(10, 3));
        System.out.println(set_no(10, 03));
    }
}
