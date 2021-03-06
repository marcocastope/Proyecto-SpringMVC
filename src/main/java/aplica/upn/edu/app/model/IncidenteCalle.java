package aplica.upn.edu.app.model;

import java.util.Date;

public class IncidenteCalle {

	private int idincident;
	private int street;
	private String description;
	private Date date;
	private String address;
	private String status;

	public int getIdincident() {
		return idincident;
	}

	public void setIdincident(int idincident) {
		this.idincident = idincident;
	}

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "IncidenteCalle [idincident=" + idincident + ", street=" + street + ", description=" + description
				+ ", date=" + date + ", address=" + address + ", status=" + status + "]";
	}

}
