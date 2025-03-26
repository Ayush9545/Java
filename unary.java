public class unary {
    public static void main(String args[]) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Next");
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        System.out.println("Same goes for decrement");
    }
}
