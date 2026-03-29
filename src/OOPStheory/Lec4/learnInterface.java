package OOPStheory.Lec4;

interface Animal2 {
    int legs = 4; // by default ye public static final
    void eats();
    void drinks();
}

interface Pet1 {
    void sings();
    void drinks();
}

class Monkey2 implements Animal, Pet1 {
    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is singing's");
    }
}

public class learnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();

        monkey.eats();
        monkey.sings();
        monkey.drinks();

        System.out.println(Animal.legs);
    }
}
