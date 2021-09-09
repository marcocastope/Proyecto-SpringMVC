package aplica.upn.edu.app.model;

import java.util.Date;

public class Incidente {
	private int incidenteId;
	private String descripcion;
	private Date fecha;
	private int calleId;
	private String nombreCalle;
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
	public int getCalleId() {
		return calleId;
	}
	public void setCalleId(int calleId) {
		this.calleId = calleId;
	}
	public String getNombreCalle() {
		return nombreCalle;
	}
	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	@Override
	public String toString() {
		return "Incidente [incidenteId=" + incidenteId + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", calleId=" + calleId + ", nombreCalle=" + nombreCalle + "]";
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
