package mahlaka;

public class Worker extends Person {
	private String workPlace;
	private int vetrency;
	public Worker(String name, int age, int tZ, String workPlace, int vetrency) {
		super(name, age, tZ);
		this.workPlace = workPlace;
		this.vetrency = vetrency;
	}
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public int getVetrency() {
		return vetrency;
	}
	public void setVetrency(int vetrency) {
		this.vetrency = vetrency;
	}
	public String PrintWorker() {
		return "Worker [workPlace=" + workPlace + ", vetrency=" + vetrency + ", name=" + name + ", age=" + age + ", TZ="
				+ TZ + "]";
	}
}
