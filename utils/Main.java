package utils;

import entities.Dog;
import mahlaka.Driver;
import mahlaka.Person;
import mahlaka.Worker;
import entities.Cat;

public class Main {

	public static void main(String[] args) {
//		Dog d1 = new Dog("lamalo", "gryish", 2, "omer");
//		Dog d2 = new Dog("lili", "unknown", 4, "gaylord");
//		Cat c1 = new Cat("dumbass", "red", 4, 47);
//		Dog d3 = new Dog("dylan", 4, "amazing");
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(c1);
//		System.out.println(d3);
//		d1.makeASound();
//		d2.makeASound();
//		c1.makeASound();
		Person p = new Person("dylan", 23, 31278743);
		Worker w = new Worker("ayay", 21, 0452344, "school", 5);
		Driver d = new Driver("bake", 18, 93534509, "o+", 8273948, "awsome");
		System.out.println(p.PrintBasic());
		System.out.println(w.PrintWorker());
		System.out.println(d.printDriver());
	}

}
