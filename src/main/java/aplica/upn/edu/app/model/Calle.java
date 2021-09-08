package aplica.upn.edu.app.model;

public class Calle {

	private int id;
	private String direccion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Calle [id=" + id + ", direccion=" + direccion + "]";
	}

}
