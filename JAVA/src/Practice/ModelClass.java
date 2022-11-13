package Practice;

public class ModelClass {

	private String name;

	private String city;
	private int ph;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPh() {
		return ph;
	}

	public void setPh(int ph) {
		this.ph = ph;
	}

	public ModelClass(String name, String city, int ph) {
		super();
		this.name = name;
		this.city = city;
		this.ph = ph;
	}

	
}
