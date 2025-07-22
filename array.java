public class array {

    public static int funarray(int no[], int key){
        for (int i = 0; i < no.length; i++) {
            if (i == no.length) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int no[] = {2, 3, 4, 5, 6};
        int key = 10;
        funarray(no, key);
    }
}
