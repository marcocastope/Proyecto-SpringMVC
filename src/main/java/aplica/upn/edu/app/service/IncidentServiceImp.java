package aplica.upn.edu.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplica.upn.edu.app.dao.IncidentDao;
import aplica.upn.edu.app.model.Incident;
import aplica.upn.edu.app.model.IncidenteCalle;

@Service
public class IncidentServiceImp implements IncidentService {

	@Autowired
	private IncidentDao incidentDao;

	@Override
	public void createIncidente(Incident incident) throws Exception {
		incidentDao.createIncidente(incident);
	}

	@Override
	public void updateIncidente(Incident incident) throws Exception {
		incidentDao.updateIncidente(incident);
	}

	@Override
	public void deleteIncidente(Integer id) throws Exception {
		incidentDao.deleteIncidente(id);
	}

	@Override
	public IncidenteCalle findById(Integer id) throws Exception {
		return incidentDao.findById(id);
	}

	@Override
	public List<IncidenteCalle> getAll() throws Exception {
		return incidentDao.getAll();
	}

}
