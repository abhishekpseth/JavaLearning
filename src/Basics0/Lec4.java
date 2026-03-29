package Basics0;

public class Lec4 {
    public static void main(String[] args) {
        // For Loop:

        for(int i=1; i<=10; i++){
            System.out.println("i: " + i);
        }

        // While Loop:

        int j = 1;

        while(j <= 5){
            System.out.println("j: " + j);
            j++;
        }

        // Do while

        int k = 1;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k <= 5);

        //  Enhanced For Loop (for-each)

        int[] numbers = {10, 20, 30, 40, 50};
        for(int num : numbers) {
            System.out.println(num);
        }
    }
}
