package aplica.upn.edu.app.model;

import java.util.Date;

public class Incidencia {

	private int id;
	private String descripcion;
	private Date fecha;
	private String lugar;
	private String estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Incidencia [id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + ", lugar=" + lugar
				+ ", estado=" + estado + "]";
	}

}
