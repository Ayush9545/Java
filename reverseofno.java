public class reverseofno {
    public static void main(String[] args) {
        int n = 10899;
        int s = 0;
        while (n>0) {
            s = n % 10;
            System.out.print(s);
            n = n / 10; 
        }
    }
}
