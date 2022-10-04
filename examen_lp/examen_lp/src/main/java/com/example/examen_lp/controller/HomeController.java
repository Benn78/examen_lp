package com.example.examen_lp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen_lp.entity.OrdenPorCategoria;
import com.example.examen_lp.entity.OrdenPorFecha;
import com.example.examen_lp.entity.OrdenPorPais;
import com.example.examen_lp.service.OrdenPorCategoriaService;
import com.example.examen_lp.service.OrdenPorFechaService;
import com.example.examen_lp.service.OrdenPorPaisService;

@RestController
@RequestMapping("/api/home")
@CrossOrigin({"*"})
public class HomeController {
	
	@Autowired
	private OrdenPorCategoriaService categoriaService;
	
	@Autowired
	private OrdenPorPaisService paisService;
	
	@Autowired
	private OrdenPorFechaService fechaService;
	
	@GetMapping("/OrdenPorCategoria")
	public List<OrdenPorCategoria> listarCategoria() {
		return categoriaService.readAll();
	};
	
	@GetMapping("/OrdenPorPais")
	public List<OrdenPorPais> listarPais() {
		return paisService.readAll();
	};
	
	@GetMapping("/OrdenPorFecha")
	public List<OrdenPorFecha> listarFecha() {
		return fechaService.readAll();
	};
}
