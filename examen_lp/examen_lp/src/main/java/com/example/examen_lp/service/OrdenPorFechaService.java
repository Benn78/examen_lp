package com.example.examen_lp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen_lp.dao.Todo;
import com.example.examen_lp.daoImpl.OrdenPorFechaDaoImpl;
import com.example.examen_lp.entity.OrdenPorFecha;

@Service
public class OrdenPorFechaService implements Todo<OrdenPorFecha>{
	
	@Autowired
	private OrdenPorFechaDaoImpl fechaDao;

	@Override
	public List<OrdenPorFecha> readAll() {
		// TODO Auto-generated method stub
		return fechaDao.readAll();
	}
	

}
