package entities;

public class Dog extends Animal {
	private final String  breed;

	public Dog(String name, String color, int legs, String breed) {
		super(name, color, legs);
		this.breed = breed;
	}
	public Dog( String name,int legs,String breed ) {
		super(name,legs);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}
	

	@Override
	public void makeASound() {
		System.out.println("wolf");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", name=" + name + ", color=" + color + ", legs=" + legs + "]";
	}

}
