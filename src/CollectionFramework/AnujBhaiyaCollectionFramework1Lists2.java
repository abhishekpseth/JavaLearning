package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class AnujBhaiyaCollectionFramework1Lists2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        for(int i=0; i<fruits.size(); i++){
            System.out.println("fruit is"+ fruits.get(i));
        }

        for(String fruit: fruits){
            System.out.println("For each fruit"+fruit);
        }

        Iterator<String> it = fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); // .next() pehle print krega fir next pe jaega
        }

        List<String> smallList = fruits.subList(1, 2); // kha se (incluive) kha tk (exclusive)
        System.out.println(smallList);

        // stack-> will have all elements of list also have other methods of stack

        Stack<String> st = new Stack<>();

        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");

        System.out.println(st.pop()); // print and pop the top element
        System.out.println(st);
        System.out.println(st.peek()); // print the top element
        System.out.println(st);

        System.out.println(st.empty()); // stack ka method hai ye
        System.out.println(st.isEmpty()); // list ka method hai ye
    }
}
