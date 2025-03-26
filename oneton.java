import java.util.Scanner;

public class oneton {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int a = sc.nextInt();

        int con = 0;
        while (con<a) {
            System.out.print(con+" ");
            con++;

        }



        System.out.println("Enter the number: ");
        int b = sc.nextInt();

        int i = 1;
        int sum = 0;
        while (i<=b) {
            sum += i;
            i++;
            
        }
        System.out.println("Sum is "+ sum);
    }
}
