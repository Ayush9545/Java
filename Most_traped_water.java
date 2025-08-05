import java.util.ArrayList;

public class Most_traped_water {

    // BRUTE FORCE - O(n^2)
    public static int water(ArrayList<Integer> hight) {
        int max_water = 0;
        for (int i = 0; i < hight.size(); i++) {
            for (int j = i + 1; j < hight.size(); j++) {
                int min_hight = Math.min(hight.get(i), hight.get(j));
                int width = j - i;
                int water = min_hight * width;
                max_water = Math.max(max_water, water);
            }
        }
        return max_water;
    }

    // OPTIMIZE CODE - O(n)
    public static int traped_water(ArrayList<Integer> ht) {
        int maxwater = 0;
        int lp = 0;
        int rp = ht.size() - 1;

        while (lp < rp) {
            int minhight = Math.min(ht.get(rp), ht.get(lp)) * (rp - lp);
            // int wdh = rp - lp;
            // int wt = minhight * wdh;
            maxwater = Math.max(maxwater, minhight);
            if (ht.get(rp) > ht.get(lp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println("Brute force answer: " + water(list));
        System.out.println("Optimize code answer: " + traped_water(list));
    }
}
