package OOPStheory.Lec5;

class Car3 {
    int price;
    int year;

    public Car3(int price, int year){
        this.price = price;
        this.year = year;
    }

    // very basic implementation of how equals() works
//    public boolean equals(Object obj){
//        Car3 that = (Car3)obj;
//        if(this.price == that.price && this.year == that.year)return true;
//
//        return false;
//    }


    // intellij generate equals and hashcode
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car3 car3 = (Car3) o;
//        return price == car3.price && year == car3.year;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(price, year);
//    }
}

public class AnujBhaiyaOOPS5Object {
    public static void main(String[] args) {
        Car3 obj1 = new Car3(12, 2025);

        // to string kisi bhi object ko ek human readable form me change krdeta hai..
        // although yha abhi jarurat nhi h iski pr likh skte hai. toString() likhne/na likhne se same output aayega idhr as vo bina likhe bhi toString method hi call krta hai
        System.out.println(obj1.toString());

        Car3 obj2 = new Car3(12, 2025);

        System.out.println(obj1 == obj2); // ye false dega kyunki obj1 and obj2 ke paas same data hai pr dono ka reference alag alag hai kyunki heap me dono alg alag stored hai

        System.out.println(obj1.equals(obj2)); // ye true dega kyunki andar ka data same hai
    }
}
