public class number_pattern2 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
