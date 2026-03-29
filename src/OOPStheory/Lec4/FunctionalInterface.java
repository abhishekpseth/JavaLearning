package OOPStheory.Lec4;

@java.lang.FunctionalInterface
interface fnInterface {
    void interfaceMethod ();
}

interface WalkAble {
    int walk(int steps);
}

public class FunctionalInterface  {
    fnInterface obj2 = new fnInterface(){
        @Override
        public void interfaceMethod() {

        }
    };

    // this can also be written as

    fnInterface obj3 = () -> {

    };

    public static void main(String[] args) {
        WalkAble walkAble = (int steps) -> {
            System.out.println("walking");
            return 0;
        };

        walkAble.walk(5);
    }
}
