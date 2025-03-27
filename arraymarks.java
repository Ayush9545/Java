public class arraymarks {

    public static void newmarks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks [i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {22, 33, 44, 55};
        newmarks(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}