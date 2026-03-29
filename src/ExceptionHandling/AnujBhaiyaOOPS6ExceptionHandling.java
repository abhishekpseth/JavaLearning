package ExceptionHandling;

public class AnujBhaiyaOOPS6ExceptionHandling {
    public static void main(String[] args) {
        int[] a = new int[5];

        System.out.println("Hello guys");
        try{
            int result = 5/9;
            System.out.println(a[8]); // yha se catch me chala jaega
            System.out.println("middle");
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
            System.out.println("Handling the exceptions");
        }catch (RuntimeException e){
            System.out.println("This is parent of all runtime exceptions");
        } catch (Exception e) {
            System.out.println("This is parent of all exceptions (including runtime)");
        } finally {
            System.out.println("This will print everytime");

            // this will be run everytime except:
            // 1. Use of System.exit() method
            // 2. An exception occurs in the final block
            // 3. The death of a thread
        }

        System.out.println("Bye world");

        try {
            getNumberFromArray(a);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("catch the exceptions");
        }
    }

    // throws is used in function ye batane k liye ki ye function exception throw kr skta hai so while calling apan try catch use krle
    static int getNumberFromArray(int[] a) throws IndexOutOfBoundsException {
        return a[8];
    }
}
