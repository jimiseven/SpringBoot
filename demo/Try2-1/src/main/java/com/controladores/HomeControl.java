package com.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeControl {

	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "hola hola";
	}
}
