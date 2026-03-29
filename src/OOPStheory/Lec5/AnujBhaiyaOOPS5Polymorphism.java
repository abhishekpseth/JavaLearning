package OOPStheory.Lec5;

class Data {
    int data;

    public void printData() {
        System.out.println(data);
    }

    public void printData(int times){
        for(int i=0; i<times; i++){
            System.out.println(data);
        }
    }
}

class ChildData extends Data {
    @Override
    public void printData() {
        System.out.println("overridden"+data);
    }

    public void insideChildOnly() {
        System.out.println("this function is only child only");
    }
}

public class AnujBhaiyaOOPS5Polymorphism {
    public static void main(String[] args) {
        Data d;
        d = new ChildData();

        d.printData(); // run time polymorphism or method overriding

        // compile time polymorphism or method overloading
        Data d2 = new Data();
        d2.printData(); // will print data
        d2.printData(5); // will print data 5 times
        d.printData(5); // ye bhi compile time hi hai


        // agar koi method bs child me hai to use parent ke object se access ni kr skte hai
        // ex: d.insideChildOnly ye method available nhi hai kyunki d is an object of parent
    }
}
