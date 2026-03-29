package CollectionFramework;

import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;

public class AnujBhaiyaCollectionFramework2Set {

    enum Color {
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>(); // no same order , mostly o(1)
        // Set<Integer> set = new LinkedHashSet<>(); // same order, mostly o(n)
        Set<Integer> set = new TreeSet<>(); // sorted order- uses binary search tree, mostly o(logn)

        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);

        System.out.println(set);

        set.remove(10);

        System.out.println(set);

        System.out.println(set.contains(10));

        System.out.println(set);

        // enum set

        // System.out.println(Color.RED);

        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);


    }
}
