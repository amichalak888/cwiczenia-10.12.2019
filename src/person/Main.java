package person;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ala", 10, 'f');
        Person person2 = new Person("Filip", 19, 'm');
        Person person3 = new Person("Jan", 50, 'm');
        Person person4 = new Person("Aneta", 30, 'f');

        List<Person> personList = new LinkedList<Person>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        List<Person> lista = personList.stream()
                .filter(Person.osobyPoniżej20rokuZycia())
                .collect(Collectors.toList());

        System.out.println(lista);

        List<Person> osobyZImieniemNaA = personList.stream().filter(Person.oosobyZImieniemNaA()).collect(Collectors.toList());
        System.out.println(osobyZImieniemNaA);

//        List<Person> duzeLitery = personList.stream()
//                .map(p -> new Person(p.getName().toUpperCase(), p.getAge(), p.getSex()))
//                .collect(Collectors.toList());
//        System.out.println(duzeLitery);
        List<String> duzeLitery2 = personList.stream().map(p -> p.getName().toUpperCase() + p.getAge() + p.getSex())
                .collect(Collectors.toList());
        System.out.println(duzeLitery2);
    }

    }

