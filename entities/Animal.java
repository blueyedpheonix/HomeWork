package entities;

public class Animal {
	protected String name;
	protected String color;
	protected int legs;

	public Animal(String name, String color, int legs) {
		super();
		this.name = name;
		this.color = color;
		this.legs = legs;
	}
	public Animal(String name, int legs) {
		this(name, "green", legs);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	public void makeASound() {
		System.out.println("?");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", legs=" + legs + "]";
	}

}
