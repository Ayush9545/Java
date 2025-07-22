public class reverse_in_array {
    public static void rev(int marks[]){
        int f = 0, l = marks.length - 1;

        while (l > f) {
            int temp = marks[f];
            marks[f] = marks[l];
            marks[l] = temp;

            f++;
            l--;
        }
    }

    public static void main(String[] args) {
        int mark[] = {1, 2, 3, 4, 5, 6};
        rev(mark);
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i] + " ");
        }
        System.out.println();
    }
}
