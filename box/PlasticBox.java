package box;

public class PlasticBox extends Box {

	private int length;
	private int width;
	private int hight;
	public PlasticBox(String tavit, double valume, int length, int width, int hight) {
		super(tavit, valume);
		this.length = length;
		this.width = width;
		this.hight = hight;
	}
	public void valumCalc() {
		double newvalum = length * width * hight;
		setValume(newvalum);
	}
	

}
