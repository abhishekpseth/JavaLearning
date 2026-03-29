package OOPStheory.Lec4;

class OuterClass {
    public void outerMethod() {}
}

interface SuperInterface {
    void outerMethod();
}

public class LearnAnonymous {
//    class InnerClass extends OuterClass {
//
//    }

//    OuterClass obj = new OuterClass() {
//        void sing(){}
//
//        @Override
//        public void outerMethod() {}
//    };

    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void outerMethod() {

        }
    };
}
