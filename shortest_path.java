public class shortest_path {

    public static int dic(String a) {
        int x = 0, y = 0, sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'S') {
                y--;
            }
            if (a.charAt(i) == 'N') {
                y++;
            }
            if (a.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
            int x1 = x * x;
            int y1 = y * y;
            sum = (int) Math.sqrt(x1 + y1);
        }
        return sum;
    }

    public static void main(String[] args) {
        String a = "WNEENESENNN";

        System.out.println(dic(a));
    }
}
