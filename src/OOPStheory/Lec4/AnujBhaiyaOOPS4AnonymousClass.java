package OOPStheory.Lec4;

public class AnujBhaiyaOOPS4AnonymousClass {
    // named class
//    class InnerClass1 extends  OuterClass {
//
//    }

    // anonymous class- bs ek bar hi use kr skte hai
    OuterClass obj = new OuterClass() {
        void sing(){

        }

        // we can override parent class methods too
        public void outerMethod(){

        }
    };

    // using interface for making anonymous class

    SuperInterface obj2 = new SuperInterface(){
        @Override
        public void someInterfaceMethod() {
            System.out.println("hii");
        }
    };
}

class OuterClass {
    public void outerMethod() {

    }
}

// another way using interface
interface SuperInterface {
    void someInterfaceMethod();
}