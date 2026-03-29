package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class AnujBhaiyaCollectionFramework2 {
    public static void main(String[] args) {
        // queue methods

        // add: insert a element in queue
        // offer: insert but return true if inserted successfully else false

        // remove: removes n returns the front element and throw exception if queue is empty
        // poll: removes n returns the front element and null if queue is empty

        // element: returns the front element but throw exception when queue is empty
        // peek: returns the front element but returns null when queue is empty

        Queue<Integer> q = new LinkedList<>(); // kyunki ye ek interface hai to we can implement it using linkedlist
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        System.out.println(q.poll());

        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q);
    }
}
