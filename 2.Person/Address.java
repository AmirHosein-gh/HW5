
public class Address {
	private String ally;
	private String street;
	private int zone;
	private String city;
	private String postalCode;

	public String getAlly() {
		return ally;
	}

	public void setAlly(String ally) {
		this.ally = ally;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Address() {
		super();
	}

	public Address(String ally, String street, int zone, String city, String postalCode) {
		super();
		this.ally = ally;
		this.street = street;
		this.zone = zone;
		this.city = city;
		this.postalCode = postalCode;
	}
}
