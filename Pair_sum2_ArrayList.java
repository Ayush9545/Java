import java.util.*;

public class Pair_sum2_ArrayList {

    public static boolean sum(ArrayList<Integer> list, int target) {
        int bp = 0;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            if (list.get(rp) + list.get(lp) == target) {
                return true;
            }
            if (list.get(rp) + list.get(lp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp + 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(sum(list, 7));
    }
}
