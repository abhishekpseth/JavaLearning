package CollectionFramework;

import java.util.ArrayDeque;

public class AnujBhaiyaCollectionFramework2Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);

        System.out.println(dq);

        System.out.println(dq.poll());
        System.out.println(dq.pollLast());

        System.out.println(dq);

        System.out.println(dq.peekLast());

        // stack use krna hai to recommended hai ki deque ki implementation use kro instead of stack ki
        // kyunki stack ki implementation vector se aati h to thread safe hoti h that means slow
        // and array deque ki faster hoti hai

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("queue "+q);


        // summart

        //       1,2,3,4,5
        //  push            offer
        // add first        add
        // add First        add Last
        // Poll             Poll Last
        // Pop              Remove Last
        // Poll first
        // Remove first
    }
}
