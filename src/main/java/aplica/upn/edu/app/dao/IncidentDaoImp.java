package aplica.upn.edu.app.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import aplica.upn.edu.app.model.Incident;
import aplica.upn.edu.app.model.IncidenteCalle;

public class IncidentDaoImp implements IncidentDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void createIncidente(Incident incident) throws Exception {
		String query = "INSERT INTO incident (description, street) VALUES (?, ?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(query, new Object[] { incident.getDescription(), incident.getStreet().getIdstreet() });
	}

	@Override
	public void updateIncidente(Incident incident) throws Exception {
		String query = "UPDATE incident SET description = ?, street = ? WHERE idincident = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(query, new Object[] { incident.getDescription(), incident.getStreet().getIdstreet(),
				incident.getIdincident() });
	}

	@Override
	public void deleteIncidente(Integer id) throws Exception {
		String query = "DELETE FROM incident WHERE idincident = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(query, new Object[] { id });
	}

	@Override
	public IncidenteCalle findById(Integer id) throws Exception {
		String query = "SELECT i.idincident, i.description, i.date, s.address, u.name AS status "
				+ "FROM incident AS i INNER JOIN street AS s ON i.street = s.idstreet INNER JOIN status AS u ON i.status = u.idstatus WHERE idincident= ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		IncidenteCalle incidentStreet = jdbcTemplate.queryForObject(query, new Object[] { id },
				new BeanPropertyRowMapper<IncidenteCalle>(IncidenteCalle.class));
		return incidentStreet;
	}

	@Override
	public List<IncidenteCalle> getAll() throws Exception {
		String query = "SELECT i.idincident, i.description, i.date, s.address, u.name AS status "
				+ "FROM incident AS i INNER JOIN street AS s ON i.street = s.idstreet INNER JOIN status AS u ON i.status = u.idstatus;";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<IncidenteCalle> lista = jdbcTemplate.query(query,
				new BeanPropertyRowMapper<IncidenteCalle>(IncidenteCalle.class));
		return lista;
	}

}
