public class trap_water {

    public static int trap(int hight[]) {
        int n = hight.length;

        // to calulate the maximum for left side
        int left_max[] = new int[n];
        left_max[0] = hight[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(hight[i], left_max[i - 1]);
        }
        // to calulate the minimum for right side
        int right_max[] = new int[n];
        right_max[n - 1] = hight[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(hight[i], right_max[i + 1]);
        }

        //loop to repeat who is min and add the all water
        int tap_water = 0;
        for (int i = 0; i < n; i++) {
            // to calulate the min in left and max in right
            int water_level = Math.min(left_max[i], right_max[i]);
            // adding all water
            tap_water += water_level - hight[i];
        }
        return tap_water;
    }

    public static void main(String[] args) {
        int hight[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trap(hight));
    }
}
