package box;

public class Box {
	protected String tavit;
	protected double valume;
	public Box(String tavit, double valume) {
		this.tavit = tavit;
		this.valume = getValume();
	}
	
	
	public String getTavit() {
		return tavit;
	}


	public void setTavit(String tavit) {
		this.tavit = tavit;
	}


	public double getValume() {
		return valume;
	}


	public void setValume(double valume) {
		this.valume = valume;
	}


	public String boxData() {
		return "Box data: [tavit=" + tavit + ", valume=" + valume + "]";
	}
	
	

}
