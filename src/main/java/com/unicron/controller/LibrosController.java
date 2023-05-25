package com.unicron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.unicron.entity.Autor;
import com.unicron.entity.Genero;
import com.unicron.entity.Libros;
import com.unicron.service.IAutorService;
import com.unicron.service.IGeneroService;
import com.unicron.service.ILibrosService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/libros")
public class LibrosController {
	@Autowired
	IAutorService autorService;
	
	@Autowired
	IGeneroService generoService;
	
	@Autowired
	ILibrosService librosService;
	
	@GetMapping("/listado")
	public String obtenerLibros(Model model) {
		List<Libros> libros = librosService.getLibros();
		List<Autor> autores = autorService.getAutores();
		List<Genero> generos = generoService.getGeneros();
		
		model.addAttribute("libros", libros);
		model.addAttribute("autores", autores);
		model.addAttribute("generos", generos);
		
		return "listado-munoz";
	}
	
	@GetMapping("/actualizar/{cod}")
	public String actualizarLibro(@PathVariable Integer cod, Model model) {
		Libros l = librosService.obtenerCodigo(cod);
		
		List<Autor> autores = autorService.getAutores();
		List<Genero> generos = generoService.getGeneros();
		
		model.addAttribute("libros", l);
		model.addAttribute("autores", autores);
		model.addAttribute("generos", generos);
		return "mantenimiento-munoz";
	}
	
	@PostMapping("/save")
	public String aplicarActualizacion(@Valid @ModelAttribute(name = "libros") Libros bean,
									   RedirectAttributes redirect) {
		try {
			librosService.actualizar(bean);
			redirect.addFlashAttribute("mensaje","Libro actualizado correctamente");
		} catch (Exception e) {
			redirect.addFlashAttribute("error","Error al actualizar libro, vuelva a intentarlo");
			e.printStackTrace();
		}
		
		return "redirect:/libros/listado";
	}
}
