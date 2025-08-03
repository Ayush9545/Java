public class Recursion_sum {

    public static int re(int a){
        if (a==0) {
            return 0;
        }
        // OR WE CAN DO THIS TOO
        // if (a==1) {
        //     return 1;
        // }
        int f = re(a-1);
        int f2 = a+ re(a-1);
        return f2;
    }
    public static void main(String[] args) {
        System.out.println(re(5));
    }
}
