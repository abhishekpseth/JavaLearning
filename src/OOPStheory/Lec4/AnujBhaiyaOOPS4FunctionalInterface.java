package OOPStheory.Lec4;

public class AnujBhaiyaOOPS4FunctionalInterface {

    // method 1:
    Flower flower1 = new Flower() {
        @Override
        public int bloom(int days) {
            System.out.println("Flower blooms");
            return days;
        }
    };

    //method 2: using lambda expression (only for functional interface .. i.e. interface with only one method)
    Flower flower2 = (int days) -> {
        System.out.println("Flower blooms using lambda expression");
        return days;
    };

    public static void main(String[] args) {
        Flower flower3 = (int days) -> {
            System.out.println("Flower blooms using lambda expression");
            return days;
        };
        flower3.bloom(5);

        // Flower flower4 = (int days) -> 2*days; one way
        // Flower flower4 = (days) -> 2*days; other way int bhi hata do parameter ka
        Flower flower4 = days -> 2*days; // parenthesis bhi hta do

        System.out.println(flower4.bloom(4));
    }
}

// interface having single method is called functional interface
// we can use its annotation which will restrict the interface to not allow more than one method

@FunctionalInterface
interface Flower {
    int bloom(int days);
}