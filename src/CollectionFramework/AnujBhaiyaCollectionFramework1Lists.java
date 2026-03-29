package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class AnujBhaiyaCollectionFramework1Lists {
    public static void main(String[] args) {
        // array

        int[] a = new int[10];

        // Array List (or vector)
        List<Integer> list = new ArrayList<>();

        // ############ collection method ##############
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list); // output-> [10, 20, 30] list me already to string bana hota hai

        System.out.println(list.contains(20));
        list.remove(1); // pass either index or object
        list.remove(Integer.valueOf(1)); // removes value since its taking object

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);

//        list.addAll(list2);
//        list.removeAll(list2);
//        list.clear();
//        Object[] a = list.toArray();

        System.out.println(list2);

        // ######### List Method ##############

        System.out.println(list.get(0)); // prints the first index
        list.set(1, 200); // set a particular index

        list.add(2, 1000); // 2nd element 1000 bn jaega and 2->end tk sb element aage shift ho jaenge
        System.out.println(list.indexOf(1)); // get index of element if present else -1

    }
}
