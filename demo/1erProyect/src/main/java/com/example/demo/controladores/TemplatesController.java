package com.example.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//para hacer uso de los controladores
@RequestMapping("/templates")//para mapear la url, especificamente templates
public class TemplatesController {
	
	@GetMapping("")//para convertirlos en vistas, tener contralados las rutas que manejamos
	public String home(Model model) {//objeto de java
		
		String nombre = "jimijoe";
		String pais = "Bolivia";
		model.addAttribute("nombre", nombre);
		model.addAttribute("pais", pais);
		
		return	"templates/home";
		
	}
}
