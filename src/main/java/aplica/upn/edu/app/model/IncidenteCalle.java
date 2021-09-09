package aplica.upn.edu.app.model;

import java.util.Date;

public class IncidenteCalle {

	private int incidenteId;
	private int calleId;
	private String descripcion;
	private Date fecha;
	private String direccion;
	private String estado;

	public int getIncidenteId() {
		return incidenteId;
	}

	public void setIncidenteId(int incidenteId) {
		this.incidenteId = incidenteId;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "IncidenteCalle [incidenteId=" + incidenteId + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", direccion=" + direccion + ", estado=" + estado + "]";
	}

	public int getCalleId() {
		return calleId;
	}

	public void setCalleId(int calleId) {
		this.calleId = calleId;
	}

}
