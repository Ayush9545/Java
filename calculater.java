import java.util.Scanner;

public class calculater {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a: ");
        int no1 = sc.nextInt();

        System.out.println("enter b: ");
        int no2 = sc.nextInt();

        System.out.println("Enter the oprator: ");
        char no = sc.next().charAt(0);

        switch (no) {
            case '+' : System.out.println(no1+no2);
                
                break;

            case '-' : System.out.println(no1-no2);

                break;
            case '*' : System.out.println(no1*no2);

                break;
            
            case '/' : System.out.println(no1/no2);

                break;

            case '%' : System.out.println(no1%no2);

                break;
        
            default: System.out.println("wrong operator");
                break;
        }
    }
}
