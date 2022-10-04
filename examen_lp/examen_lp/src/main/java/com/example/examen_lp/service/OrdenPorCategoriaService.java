package com.example.examen_lp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen_lp.dao.Todo;
import com.example.examen_lp.daoImpl.OrdenPorCategoriaDaoImpl;
import com.example.examen_lp.entity.OrdenPorCategoria;

@Service
public class OrdenPorCategoriaService implements Todo<OrdenPorCategoria>{
	
	@Autowired
	private OrdenPorCategoriaDaoImpl categoriaDao;

	@Override
	public List<OrdenPorCategoria> readAll() {
		// TODO Auto-generated method stub
		return categoriaDao.readAll();
	}

}
