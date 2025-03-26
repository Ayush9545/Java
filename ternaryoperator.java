import java.util.Scanner;

public class ternaryoperator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int number = 4;

        String type = ((number%2)==1) ? "odd":"even";
        System.out.println(type);

        int no = s.nextInt();
        String marks = ((no>33)) ? "Pass":"Fail";
        System.out.println(marks);
    }
}
