package com.example.examen_lp.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.examen_lp.dao.Todo;
import com.example.examen_lp.entity.OrdenPorCategoria;

@Component
public class OrdenPorCategoriaDaoImpl implements Todo<OrdenPorCategoria>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<OrdenPorCategoria> readAll() {
		String query = "SELECT p.UnitsOnOrder, p.ProductName, c.CategoryName FROM products p INNER JOIN categories c ON p.CategoryID=c.CategoryID;";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<OrdenPorCategoria>(OrdenPorCategoria.class));
	}

}
