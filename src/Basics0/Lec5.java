package Basics0;

public class Lec5 {
    public static void main(String[] args) {
        //    An array is a collection of elements of the same type stored in contiguous memory.
        //            Fixed size (you cannot resize after creation).
        //            Index-based (starts from 0).
        //            Can store primitives (int, char, double) or objects (String, custom classes).

        // Declaration:
        int even[] = {2, 4, 6, 8, 10}; // works but its c style
        int[] odd = {1, 3, 5, 7, 9}; // preferred way to declare array
        int[] nums;

        // Initialisation:
        nums = new int[5]; // creates an array of size 5 (default values = 0)

        // Declaration + Initialisation:

        // 2D Array / Matrix

        int[][] arr = new int[4][5]; // row, col
    }
}
