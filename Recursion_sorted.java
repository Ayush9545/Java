public class Recursion_sorted {

    public static boolean re(int arr[], int a) {
        if (a == arr.length - 1) {
            return true;
        }

        if (arr[a] > arr[a + 1]) {
            return false;
        }
        return re(arr, a + 1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println(re(a, 0));
    }

}
