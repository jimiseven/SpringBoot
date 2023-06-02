package com.example.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

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
	
	
	@GetMapping("/atributos")
	public String atributos(Model model) {
		Integer num1 = 12;
		Integer num2 = 13;
		Integer num3 = 14;
		Date fecha = new Date();
		List<String> paises = new ArrayList<String>();
		//ya creamos las variables de las cuales aremos uso
		//ahora vamos a crear sus models
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("num3", num3);
		model.addAttribute("fecha", fecha);
		model.addAttribute("paises", paises);
		return "templates/atributos";//llamando al archivo html
	}
	
}
