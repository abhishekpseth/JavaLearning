package OOPStheory.Lec5;

// heap memory me actual value hoti hai. means actual object
// stack me local variables and object k references jaate hai
// jab bhi koi function call hoti h to stack memory invoke hoti h

// koi bhi function chalta h to uske variable stack me jaate h and object heap me
// function khtm ho jata to variable to khtm ho jaate pr heap me object reh jaate
// iske liye java ka garbage collector h jo time to time aata h and safai krta hai
// c++ me khud hi flush krna pdta h

public class AnujBhaiyaOOPS5 {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(a);
        changeValue(a);
        System.out.println(a); // value of a will not change as it is int type which is stores in stack

        SomeClass obj = new SomeClass();
        obj.data = 12;

        System.out.println(obj.data);
        changeValue2(obj);
        System.out.println(obj.data); // value of object will change as it is object which stores in heap memory
    }

    static void changeValue(int a){
        a=10;
    }

    static void changeValue2(SomeClass obj){
        obj.data = 100;
    }
}

class SomeClass {
    int data;
}