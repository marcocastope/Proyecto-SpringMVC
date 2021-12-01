package aplica.upn.edu.app.model;

import java.util.Date;

public class Incident {
	private int idincident;
	private String description;
	private Date date;
	private Street street;
	private Status status;

	public int getIdincident() {
		return idincident;
	}

	public void setIdincident(int idincident) {
		this.idincident = idincident;
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

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Incident [idincident=" + idincident + ", description=" + description + ", date=" + date + ", street="
				+ street + ", status=" + status + "]";
	}

}
