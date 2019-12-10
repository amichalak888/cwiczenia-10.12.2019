package com.company;

public class Animal {
private  String imie;

    public Animal(String imie) {
        this.imie = imie;
    }

    public void dajGlos (){
        System.out.println("Animal daje głos");
    }
    static
    {
        System.out.println("Blok statyczny Animal");
    }
    {
        System.out.println("Blok zwykły Animal");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "imie='" + imie + '\'' +
                '}';
    }

    public String getImie() {
        return "imię: "+imie;
    }
}
