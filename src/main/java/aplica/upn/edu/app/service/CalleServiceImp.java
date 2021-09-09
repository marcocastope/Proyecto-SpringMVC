package aplica.upn.edu.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplica.upn.edu.app.dao.CalleDao;
import aplica.upn.edu.app.model.Calle;

@Service
public class CalleServiceImp implements CalleService {

	
	@Autowired
	private CalleDao calleDao;
	
	@Override
	public List<Calle> listarCalles() throws Exception {
		return calleDao.listarCalles();
		
	}

}
