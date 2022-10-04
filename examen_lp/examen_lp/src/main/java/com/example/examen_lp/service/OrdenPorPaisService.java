package com.example.examen_lp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen_lp.dao.Todo;
import com.example.examen_lp.daoImpl.OrdenPorPaisDaoImpl;
import com.example.examen_lp.entity.OrdenPorPais;

@Service
public class OrdenPorPaisService implements Todo<OrdenPorPais>{
	
	@Autowired
	private OrdenPorPaisDaoImpl paisDao;

	@Override
	public List<OrdenPorPais> readAll() {
		// TODO Auto-generated method stub
		return paisDao.readAll();
	}
	

}
