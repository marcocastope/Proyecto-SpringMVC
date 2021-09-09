package aplica.upn.edu.app.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import aplica.upn.edu.app.model.Calle;

public class CalleDaoImp implements CalleDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public List<Calle> listarCalles() {
		String query = "SELECT calle_id, direccion FROM calle";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<Calle> lista = jdbcTemplate.query(query, new BeanPropertyRowMapper<Calle>(Calle.class));
		return lista;
	}

}
