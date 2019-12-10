package person;

import java.util.function.Predicate;

public class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public static Predicate<Person> osobyPoniżej20rokuZycia() {
        return p -> p.getAge()<20;
    }
    public static Predicate<Person>oosobyZImieniemNaA (){
        return p -> p.getName().startsWith("a");
    }
//    public static Predicate<Person>tylkoKobiety(){
//        return p -> p.getName().toUpperCase();
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}