package aplica.upn.edu.app.dao;

import java.util.List;

import aplica.upn.edu.app.model.Incident;
import aplica.upn.edu.app.model.IncidenteCalle;

public interface IncidentDao {

	void createIncidente(Incident incident) throws Exception;

	void updateIncidente(Incident incident) throws Exception;

	void deleteIncidente(Integer id) throws Exception;

	IncidenteCalle findById(Integer id) throws Exception;

	List<IncidenteCalle> getAll() throws Exception;
}
