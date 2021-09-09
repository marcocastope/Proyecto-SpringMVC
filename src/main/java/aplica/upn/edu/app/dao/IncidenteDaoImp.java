package aplica.upn.edu.app.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import aplica.upn.edu.app.model.Incidente;
import aplica.upn.edu.app.model.IncidenteCalle;

public class IncidenteDaoImp implements IncidenteDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void createIncidente(Incidente incidente) throws Exception {
		String query = "INSERT INTO incidente (descripcion, calle_id) VALUES (?, ?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(query, new Object[] { incidente.getDescripcion(), incidente.getCalleId() });
	}

	@Override
	public void updateIncidente(Incidente incidente) throws Exception {
		String query = "UPDATE incidente SET descripcion = ?, calle_id = ? WHERE incidente_id = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(query,
				new Object[] { incidente.getDescripcion(), incidente.getCalleId(), incidente.getIncidenteId() });
	}

	@Override
	public void deleteIncidente(Integer id) throws Exception {
		String query = "DELETE FROM incidente WHERE incidente_id = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(query, new Object[] { id });
	}

	@Override
	public Incidente findById(Integer id) throws Exception {
		String query = "SELECT incidente_id, descripcion, calle_id FROM incidente WHERE incidente_id = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Incidente incidente = jdbcTemplate.queryForObject(query, new Object[] { id },
				new BeanPropertyRowMapper<Incidente>(Incidente.class));
		return incidente;
	}

	@Override
	public List<IncidenteCalle> getAll() throws Exception {
		String query = "SELECT i.incidente_id, i.descripcion, i.fecha, c.direccion, e.descripcion AS estado "
				+ "FROM incidente AS i INNER JOIN calle AS c ON i.calle_id = c.calle_id INNER JOIN estado AS e ON i.estado_id = e.estado_id;";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<IncidenteCalle> lista = jdbcTemplate.query(query,
				new BeanPropertyRowMapper<IncidenteCalle>(IncidenteCalle.class));
		return lista;
	}

}
