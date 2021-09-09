package aplica.upn.edu.app.service;

import java.util.List;

import aplica.upn.edu.app.model.Incidente;
import aplica.upn.edu.app.model.IncidenteCalle;

public interface IncidenteService {

	void createIncidente(Incidente incidente) throws Exception;

	void updateIncidente(Incidente incidente) throws Exception;

	void deleteIncidente(Integer id) throws Exception;

	Incidente findById(Integer id) throws Exception;

	List<IncidenteCalle> getAll() throws Exception;
}
