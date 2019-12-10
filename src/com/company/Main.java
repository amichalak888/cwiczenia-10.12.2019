package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Chihuahua chihuahua = new Chihuahua("Pimpek", 1, 1);
        System.out.println(chihuahua.getImie() + chihuahua.getWiek() + chihuahua.getWaga());
        Dog dog = new Dog("Kajtek", 4);
        Animal animal = new Animal("Zwierz");

        Animal[] tablica = {chihuahua, dog, animal};
        for (Animal a : tablica
        ) {
            if (a instanceof Chihuahua) {
                ((Chihuahua) a).dajGlos();
            } else if (a instanceof Dog) {
                ((Dog) a).dajGlos();
            } else {
                a.dajGlos();
            }
        }

        ;


    }
}
