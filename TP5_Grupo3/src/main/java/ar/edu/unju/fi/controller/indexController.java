package ar.edu.unju.fi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
@GetMapping("inicio")
public String getIndexPage(Model model) {
	Alumno unalumno = new Alumno ("42729295","carlos", "gutierrez","carlos@gmail.com","38843729295")
	return "index";
}

	
	
	
	
}
