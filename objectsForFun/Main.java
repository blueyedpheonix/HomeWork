package objectsForFun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Adrress adrress = new Adrress();
        Adrress adrress2 = new Adrress();
        Person friend = new Person(24, "jake", "karassik",100001,adrress2);
        adrress.setCountry("usa"); adrress.setCity("tel aviv"); adrress.setStreet("krinitsi"); adrress.setNumber(12);
        Person person = new Person(23,"omer","desezar",1000001,adrress);
        System.out.println(person.getAdrress());
//        person.setAdrress("tda","hlh","slkjddfl", 24);
        System.out.println(person);
        System.out.println(person.helloFriend(friend));
        person.adrress.setStreet("abc");
        System.out.println(person);
    }
}
