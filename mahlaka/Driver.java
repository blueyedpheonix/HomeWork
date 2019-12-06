package mahlaka;

public class Driver extends Person {
	private String bloodType;
	private int numberLicense;
	private String licneseType;
	public Driver(String name, int age, int tZ, String bloodType, int numberLicense, String licneseType) {
		super(name, age, tZ);
		this.bloodType = bloodType;
		this.numberLicense = numberLicense;
		this.licneseType = licneseType;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public int getNumberLicense() {
		return numberLicense;
	}
	public void setNumberLicense(int numberLicense) {
		this.numberLicense = numberLicense;
	}
	public String getLicneseType() {
		return licneseType;
	}
	public void setLicneseType(String licneseType) {
		this.licneseType = licneseType;
	}
	public String printDriver() {
		return "Driver [bloodType=" + bloodType + ", numberLicense=" + numberLicense + ", licneseType=" + licneseType
				+ ", name=" + name + ", age=" + age + ", TZ=" + TZ + "]";
	}

}
