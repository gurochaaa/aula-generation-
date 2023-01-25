package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //informar contraoladora 
@RequestMapping("/hello_world") //informar o endereço da web(end point)
public class helloController {

	@GetMapping
	public String helloWorld() {
		return "Hello World"; 
	}
	
	@GetMapping("/mentalidades")
	public String mentalidades() {
		return "<p>Metalidade</p>"
				+ "<p>Persistência</p>"
				+ "<p>Visão de futuro</p>"
				+ "<p>Orientação ao detalhe</p>"
				+ "<p>Orientação ao futuro</p>"
				+ "<p>Proatividade</p>"
				+ "<p>trabalho em equipe</p>"
				+ "<p>Comunicação</p>";
	}
	@GetMapping("/meus_objetivos")
	public String meusobjetivos() {
		return  "Revisar todo o conteudo de java do primeiro modulo";
	}
	
	
}