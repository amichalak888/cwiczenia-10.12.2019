package com.company;

public class Dog extends Animal {
   private int wiek;

    public Dog(String imie, int wiek) {
        super(imie);
        this.wiek = wiek;
  }

    @Override
    public void dajGlos() {
        System.out.println("Dog daje głos");
    }

    static {
        System.out.println("Blok statyczny Dog");
    }
    {
        System.out.println("Blok statyczny Dog");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "wiek = " + wiek +
                '}';
    }

    public int getWiek() {
        return wiek;
    }
}

