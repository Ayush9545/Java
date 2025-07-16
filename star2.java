public class star2 {
    public static void main (String args[]){

        for (int line = 1; line <= 4; line++) {
            for (int i = 1; i <= 4 - line + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
