public class decimal_to_binary {

    public static void dec(int num){

        int decimal = 0;
        int power = 0;

        while (num > 0 ) {
            int rem = num %2;
            decimal = decimal + (rem * (int)Math.pow(10, power));
            power++;
            num = num /2;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        int sum = 7;
        dec(sum);
    }
}
