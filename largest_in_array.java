public class largest_in_array {
    public static void mm(int array[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
    System.out.println(max);
    System.out.println(min);
    }

    public static void main(String[] args) {
        int marks[] = {11, 1, 1, 100};
        mm(marks);
    }
}
