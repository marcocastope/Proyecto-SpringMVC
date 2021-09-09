package aplica.upn.edu.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import aplica.upn.edu.app.model.Incidente;
import aplica.upn.edu.app.service.CalleService;
import aplica.upn.edu.app.service.IncidenteService;

@Controller
public class IncidenteController {

	@Autowired
	private IncidenteService incidenteService;
	
	@Autowired
	private CalleService calleService;	

	@RequestMapping(value = "/incidencias", method = RequestMethod.GET)
	public String irIncidencia(Model model) throws Exception  {
		model.addAttribute("incidencias", incidenteService.getAll());
		return "listaIncidencias";
	}
	
	@RequestMapping(value = "/irDetalle", method = RequestMethod.GET)
	public String irDetalle(@RequestParam("id") String id, Model model) throws Exception {
		model.addAttribute("incidencia", incidenteService.findById(Integer.parseInt(id)));
		return "detalle"; 
	}
	
	@RequestMapping(value = "/irEditar", method = RequestMethod.GET)
	public ModelAndView irEditar(@RequestParam("id")String id) throws Exception {
		return new ModelAndView("incidencia", "command", incidenteService.findById(Integer.parseInt(id)));
	}
	
	@RequestMapping(value = "remover", method = RequestMethod.GET)
	public ModelAndView remover(@RequestParam("id")String id) throws Exception {
		if (id != null && Integer.parseInt(id) > 0) {
			incidenteService.deleteIncidente(Integer.parseInt(id));
		}
		return new ModelAndView("listaIncidencias", "incidencias", incidenteService.getAll());
	}

	@RequestMapping(value = "/incidencia", method = RequestMethod.GET)
	public ModelAndView irRegistrar(Model model) throws Exception {
		model.addAttribute("calles", calleService.listarCalles());

		return new ModelAndView("incidencia", "command", new Incidente());
	}

	@RequestMapping(value = "/registrarIncidencia", method = RequestMethod.POST)
	//@PostMapping(value = "/registrarIncidencia")
	public String saveIncidencia(Incidente incidencia, Model model) throws Exception {
		try {
			if (incidencia.getIncidenteId() == 0) {
				incidenteService.createIncidente(incidencia);
			} else {
				incidenteService.updateIncidente(incidencia);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		model.addAttribute("incidencias", incidenteService.getAll());
		
		return "listaIncidencias";
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
