package mahlaka;

public class Person {
	protected String name;
	protected int age;
	protected int TZ;
	public Person(String name, int age, int tZ) {
		this.name = name;
		this.age = age;
		TZ = tZ;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getTZ() {
		return TZ;
	}


	public void setTZ(int tZ) {
		TZ = tZ;
	}


	public String PrintBasic() {
		return "Person [name=" + name + ", age=" + age + ", TZ=" + TZ + "]";
	}
	
	
	

}
