
public class Person {

	private String name;
	
	public Person(String name) {
		
		setName(name);
	}
	public Person() {
		this.name = "Dylan is King";
	}
	
	public void setName(String name) {
		this.name = (name.isEmpty() ? "erro" : name);
	}
	public String getName() {
		return name;
	}
	
	

}
