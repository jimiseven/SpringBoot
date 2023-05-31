package com.example.demo.controladores;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")//nos deja elegir que metodo importamos
public class HomeController {
	//
	//metodos que retornar un string
	//metodo que se usara como ruta * no todo metodo es una ruta no toda ruta es un metodo
	
	@GetMapping("/")//manera de mapear y usar el metodo
	//@ResponseBody//renderiza como texto plano lo del metodo (usado para hacer pruebas)
	
	public String home() {
		return "home/home"; //tenemos que tener cuidado de como llamamos al archivo
	}
	@GetMapping("/nosotros")
	@ResponseBody
	public String nosotros() {
		
		return "hola desde nosotros";
	}
	
	@GetMapping("/parametros/{id}/{slug}")
	@ResponseBody
	public String parametros(@PathVariable("id") Long id, @PathVariable	("slug") String slug) {
		return "id = " + id + " | slug = " + slug;
	}
	
	@GetMapping("/query-string")
	@ResponseBody
	public String query_string(@RequestParam("id") Long id, @RequestParam("slug") String slug){
		return "id = " + id + " | slug = " + slug;
	}
	
	/* 
	@Value("${jimi.valores.nombre}")//inyeccionn de dependencias manual
	private String jimiValoresNombre;
	
	@GetMapping("/valores")
	@ResponseBody
	public String valores() {
		return "jimi.valores.nombre="+this.jimiValoresNombre;
	}
	*/

	
	
}
