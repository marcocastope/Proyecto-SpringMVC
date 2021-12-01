package aplica.upn.edu.app.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import aplica.upn.edu.app.model.Street;

public class StreetDaoImp implements StreetDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public List<Street> listarCalles() {
		String query = "SELECT idstreet, address FROM street";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<Street> lista = jdbcTemplate.query(query, new BeanPropertyRowMapper<Street>(Street.class));
		return lista;
	}

}
