package aplica.upn.edu.app.model;

public class Street {

	private int idstreet;
	private String address;

	public int getIdstreet() {
		return idstreet;
	}

	public void setIdstreet(int idstreet) {
		this.idstreet = idstreet;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Street [idstreet=" + idstreet + ", address=" + address + "]";
	}

}
