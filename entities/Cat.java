package entities;

public class Cat extends Animal {
	private int age;

	public Cat(String name, String color, int legs, int age) {
		super(name, color, legs);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public void makeASound() {
		System.out.println("meow");
	}

	@Override
	public String toString() {
		return "cat [age=" + age + ", name=" + name + ", color=" + color + ", legs=" + legs + "]";
	}

}
