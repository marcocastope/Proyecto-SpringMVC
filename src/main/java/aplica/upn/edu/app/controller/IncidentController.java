package aplica.upn.edu.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import aplica.upn.edu.app.model.Incident;
import aplica.upn.edu.app.model.IncidenteCalle;
import aplica.upn.edu.app.service.IncidentService;
import aplica.upn.edu.app.service.StreetService;

@Controller
public class IncidentController {

	@Autowired
	private IncidentService incidentService;

	@Autowired
	private StreetService streetService;

	@RequestMapping(value = "/incidencias", method = RequestMethod.GET)
	public String irIncidencia(Model model) throws Exception {
		model.addAttribute("incidents", incidentService.getAll());
		return "incidents";
	}

	@RequestMapping(value = "/irDetalle", method = RequestMethod.GET)
	public String irDetalle(@RequestParam("id") String id, Model model) throws Exception {

		IncidenteCalle incident = incidentService.findById(Integer.parseInt(id));
		//Street street = new Street();
		//street.setIdstreet(incident.getStreet().getIdstreet());
		//incident.setStreet(street);

		model.addAttribute("incident", incident);
		return "detail";
	}

	@RequestMapping(value = "/irEditar", method = RequestMethod.GET)
	public ModelAndView irEditar(@RequestParam("id") String id) throws Exception {
		return new ModelAndView("incident", "command", incidentService.findById(Integer.parseInt(id)));
	}

	@RequestMapping(value = "remover", method = RequestMethod.GET)
	public ModelAndView remover(@RequestParam("id") String id) throws Exception {
		if (id != null && Integer.parseInt(id) > 0) {
			incidentService.deleteIncidente(Integer.parseInt(id));
		}
		return new ModelAndView("incidents", "incidents", incidentService.getAll());
	}

	@RequestMapping(value = "/incidencia", method = RequestMethod.GET)
	public ModelAndView irRegistrar(Model model) throws Exception {
		model.addAttribute("streets", streetService.listarCalles());

		return new ModelAndView("incident", "command", new Incident());
	}

	@RequestMapping(value = "/registrarIncidencia", method = RequestMethod.POST)
	// @PostMapping(value = "/registrarIncidencia")
	public String saveIncidencia(Incident incident, Model model) throws Exception {
		try {
			if (incident.getIdincident() == 0) {
				incidentService.createIncidente(incident);
			} else {
				incidentService.updateIncidente(incident);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		model.addAttribute("incidents", incidentService.getAll());

		return "incidents";
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
}
