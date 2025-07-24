public class pairs_in_array {

    public static void pair(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int current = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + current + "," + number[j] + ") ");
                tp++;
            }
            System.out.println();    
        }
        System.out.println(tp);
    }

    public static void main(String[] args) {
        int marks[] = { 2, 3, 4, 5, 6 };
        pair(marks);
    }
}
