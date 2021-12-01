package aplica.upn.edu.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplica.upn.edu.app.dao.StreetDao;
import aplica.upn.edu.app.model.Street;

@Service
public class StreetServiceImp implements StreetService {

	@Autowired
	private StreetDao streetDao;

	@Override
	public List<Street> listarCalles() throws Exception {
		return streetDao.listarCalles();

	}

}
