public class function_argument {
    public static void add (int update_marks[]){
        for (int i = 0; i < update_marks.length; i++) {
            update_marks[i] = update_marks[i] + 1;
            System.out.print(update_marks[i] + " ");
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99, 100};
        add(marks);

    }
}
