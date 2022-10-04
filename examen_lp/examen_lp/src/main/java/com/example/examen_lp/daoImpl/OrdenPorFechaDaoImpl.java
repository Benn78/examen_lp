package com.example.examen_lp.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.examen_lp.dao.Todo;
import com.example.examen_lp.entity.OrdenPorFecha;

@Component
public class OrdenPorFechaDaoImpl implements Todo<OrdenPorFecha>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<OrdenPorFecha> readAll() {
		String query = "";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<OrdenPorFecha>(OrdenPorFecha.class));
	}
}
