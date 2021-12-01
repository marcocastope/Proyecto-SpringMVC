package aplica.upn.edu.app.model;

public class Status {

	private int idstatus;
	private String name;

	public int getIdstatus() {
		return idstatus;
	}

	public void setIdstatus(int idstatus) {
		this.idstatus = idstatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Status [idstatus=" + idstatus + ", name=" + name + "]";
	}

}
