package com.example.examen_lp.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.examen_lp.dao.Todo;
import com.example.examen_lp.entity.OrdenPorPais;

@Component
public class OrdenPorPaisDaoImpl implements Todo<OrdenPorPais>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<OrdenPorPais> readAll() {
		String query = "SELECT o.OrderID, o.ShipCountry FROM orders o JOIN customers c ON o.CustomerID = c.CustomerID;";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<OrdenPorPais>(OrdenPorPais.class));
	}
}
