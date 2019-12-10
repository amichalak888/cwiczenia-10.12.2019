package com.company;

public class Chihuahua extends Dog {
    private int waga;

    public Chihuahua(String imie, int wiek, int waga) {
        super(imie, wiek);
        this.waga = waga;
    }
    @Override
    public void dajGlos() {
        System.out.println("Chiususuus daje głos");}
    static {
        System.out.println("Blok statyczny Chihuahuahahah");
    }
    {
        System.out.println("Blok statyczny Chiuhahahah");
    }



    @Override
    public String toString() {
        return "Chihuahua{" +
                "waga=" + waga +
                '}';
    }

    public int getWaga() {
        return waga;
    }
}

