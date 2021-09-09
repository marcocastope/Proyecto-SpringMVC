package aplica.upn.edu.app.model;

public class Calle {

	private int calleId;
	private String direccion;

	public int getCalleId() {
		return calleId;
	}

	public void setCalleId(int calleId) {
		this.calleId = calleId;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Calle [calleId=" + calleId + ", direccion=" + direccion + "]";
	}

}
