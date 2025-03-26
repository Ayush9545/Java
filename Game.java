import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        do {
            System.out.println("Enter your no: ");
            int no = s.nextInt(); 
            if (no % 10 == 0) {
                break;
            }
            System.out.println("Guess again");
        } while (true);
        
    }
    
}
