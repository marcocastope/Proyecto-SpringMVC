package aplica.upn.edu.app.dao;

import java.util.List;

import aplica.upn.edu.app.model.Calle;

	

public interface CalleDao {	
	List<Calle> listarCalles() throws Exception;
}
