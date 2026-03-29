package Basics0;

public class Lec2 {
    public static void main(String[] args) {
        // Decimal to Binary:
        //      (26)10 = (x)2, find x?
        //
        //      2 | 26 | 0
        //      2 | 13 | 1
        //      2 | 6  | 0
        //      2 | 3  | 1
        //      2 | 1  | 1
        //        | 0  |
        //
        //      so x will be 11010
        //
        //  Binary to Decimal:
        //      (110010)2 = (x)10 find x?
        //
        //      x = 1*(2^5) + 1*(2^4) + 0*(2^3) + 0*(2^2) + 1*(2^1) + 0*(2^0)
        //      x = 50


        // Binary addition:

        //  0 1 0 1 -> 5
        //  1 0 0 1 -> 9
        // ---------------
        //  1 1 1 0

        // Binary subtraction:

        // 9 - 4 = 5
        // 9 + (-4) = 5

        // Now for getting 4's compliment:
        //   -> swap the bits
        //   -> add 1

        // 1 0 0 1 -> 9

        // 0 1 0 0 -> 4

        // For getting compliment of 4,

        // 1 0 1 1
        // 0 0 0 1
        //----------
        // 1 1 0 0

        // Now do 9 + (-4)

        // 1 0 0 1
        // 1 1 0 0
        //-----------
        // 0 1 0 1
    }
}
