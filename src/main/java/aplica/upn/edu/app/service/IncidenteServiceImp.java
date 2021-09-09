package aplica.upn.edu.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplica.upn.edu.app.dao.IncidenteDao;
import aplica.upn.edu.app.model.Incidente;
import aplica.upn.edu.app.model.IncidenteCalle;

@Service
public class IncidenteServiceImp implements IncidenteService {

	@Autowired
	private IncidenteDao incidenteDao;
	
	@Override
	public void createIncidente(Incidente incidente) throws Exception {
		incidenteDao.createIncidente(incidente);
	}

	@Override
	public void updateIncidente(Incidente incidente) throws Exception {
		incidenteDao.updateIncidente(incidente);
	}

	@Override
	public void deleteIncidente(Integer id) throws Exception {
		incidenteDao.deleteIncidente(id);
	}

	@Override
	public Incidente findById(Integer id) throws Exception {
		return incidenteDao.findById(id);
	}

	@Override
	public List<IncidenteCalle> getAll() throws Exception {
		return incidenteDao.getAll();
	}

}
