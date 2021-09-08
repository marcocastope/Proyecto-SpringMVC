package aplica.upn.edu.app.model;

public class Usuario {

	private int id;
	private String nombres;
	private String apellidos;
	private String correoElectronico;
	private String contrase�a;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correoElectronico="
				+ correoElectronico + ", contrase�a=" + contrase�a + "]";
	}

}
