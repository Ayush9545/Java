public class linear_search {
    public static int linear(int array[], int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = {21, 31, 41, 51, 61, 11, 71, 81, 91, 111};
        int value = 11;
        int index = linear(marks, value);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println(index);
        }
    }
}
