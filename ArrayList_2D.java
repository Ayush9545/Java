import java.util.ArrayList;

public class ArrayList_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainlist.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            list2.add(i * 1); // GIVES 1 2 3 4 5
            list3.add(i * 2); // GIVES 2 4 6 8 10
            list4.add(i * 3); // GIVES 3 6 9 12 15
        }
        mainlist.add(list2);
        mainlist.add(list3);
        mainlist.add(list4);

        System.out.println(mainlist.size());
        System.out.println(mainlist.get(1));
        System.out.println(mainlist);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currennt = mainlist.get(i);

            for (int j = 1; j < currennt.size(); j++) {
                System.out.print(currennt.get(j) + " ");
            }
            System.out.println();
        }
    }
}
