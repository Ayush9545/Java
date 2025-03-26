import java.util.Scanner;

public class intputadd {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a+b;
        System.out.println(sum);
        float r =s.nextFloat();
        float area = 3.14f * r * r;
        System.out.println(area);
    }
}
