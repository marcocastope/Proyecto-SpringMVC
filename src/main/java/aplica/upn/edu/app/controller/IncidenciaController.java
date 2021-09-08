package aplica.upn.edu.app.controller;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aplica.upn.edu.app.model.Calle;
import aplica.upn.edu.app.model.Incidencia;

@Controller
public class IncidenciaController {

	@RequestMapping(value = "/incidencias", method = RequestMethod.GET)
	public String irIncidencia(Model model) {
		List<Incidencia> incidencias = getLista();
		model.addAttribute("incidencias", incidencias);
		return "listaIncidencias";
	}
	
	@RequestMapping(value = "/incidencia", method = RequestMethod.GET)
	public String irRegistrar(Model model) {
	
		List<Calle> calles = getCalles();
		
		model.addAttribute("calles", calles);
		
		return "incidencia";
	}
	
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String mostrarDetalle(Model model, @PathVariable("id") int id) {
		String descripcion = "Incidencia 1";
		String lugar = "Jirón #1212";
		String autor = "Carlos";
		model.addAttribute("descripcion", descripcion);
		model.addAttribute("lugar", lugar);
		model.addAttribute("autor", autor);
		return "detalle";
	}

	
	public List<Incidencia> getLista() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Incidencia> lista = null;
		
		try {
			lista = new LinkedList<>();
			Incidencia inc = new Incidencia();
			inc.setId(1);
			inc.setDescripcion("Incidencia número 1");
			inc.setLugar("Jiron #1212");
			inc.setFecha(formatter.parse("12-10-2020"));
			inc.setEstado("Inicial");

			lista = new LinkedList<>();
			Incidencia inc2 = new Incidencia();
			inc2.setId(2);
			inc2.setDescripcion("Incidencia número 2");
			inc2.setLugar("Jiron #44444");
			inc2.setFecha(formatter.parse("05-10-2020"));
			inc2.setEstado("En Proceso");
			lista.add(inc);
			lista.add(inc2);
			return lista;
			
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Calle> getCalles() {
		
		List<Calle> calles = null;
		try {
			calles = new LinkedList<>();
			Calle calle1 = new Calle();
			Calle calle2 = new Calle();
			Calle calle3 = new Calle();
			calle1.setDireccion("ca. Numero1");
			calle2.setDireccion("ca. Numero2");
			calle3.setDireccion("ca. Numero3");
			calles.add(calle1);
			calles.add(calle2);
			calles.add(calle3);
			return calles;
		} catch (Exception e) {
			return null;
		}
	}
}
