package CollectionFramework;

import java.util.*;

class MyCustomDogComparator implements Comparator<Animal2> {
    @Override
    public int compare(Animal2 o1, Animal2 o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}

class Animal2 implements Comparable<Animal2> {
    int age;
    String name;
    int weight;

    Animal2(int age, String name, int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}'+"\n";
    }

    @Override
    public int compareTo(Animal2 that) {
        // this should return an integer

        // positive integer: current object is greater
        // negative integer: current object is lesser
        // zero: equal
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
}

public class AnujBhaiyaCollectionFramework3Comparator {
    public static void main(String[] args) {
        Animal2 a1 = new Animal2(4, "Leo", 10);
        Animal2 a2 = new Animal2(2, "Bella", 5);
        Animal2 a3 = new Animal2(3, "Max", 7);
        Animal2 a4 = new Animal2(5, "Charlie", 12);
        Animal2 a5 = new Animal2(1, "Luna", 3);
        Animal2 a6 = new Animal2(6, "Rocky", 8);
        Animal2 a7 = new Animal2(4, "Milo", 6);
        Animal2 a8 = new Animal2(3, "Daisy", 9);

        List<Animal2> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);
        dogs.add(a6);
        dogs.add(a7);
        dogs.add(a8);

        Collections.sort(dogs);

        System.out.println(dogs);

        // comparator

        Collections.sort(dogs, new MyCustomDogComparator());

        System.out.println(dogs);

        // using anonymous class

        dogs.sort(new Comparator<Animal2>() {
            @Override
            public int compare(Animal2 o1, Animal2 o2) {
                return Integer.compare(o1.weight, o2.weight);
            }
        });

        // using lamda expression

        Collections.sort(dogs, (o1, o2) -> o1.name.compareTo(o2.name));

        // using getters
        Collections.sort(dogs, Comparator.comparing(Animal2::getAge).thenComparing(Animal2::getWeight)); // .comparing function comparator hi return krta hai

        int[][] a = {
                {4,5,2},
                {5,1,2},
                {1,4,7}
        };

        Arrays.sort(a, (arr1, arr2) -> {
            return arr1[0] - arr2[0];
        });
    }
}
