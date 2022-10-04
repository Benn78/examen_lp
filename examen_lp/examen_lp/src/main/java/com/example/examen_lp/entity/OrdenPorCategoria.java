package com.example.examen_lp.entity;

import java.io.Serializable;

public class OrdenPorCategoria implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String UnitsOnOrder;
	private String ProductName;
	private String CategoryName;
	
	
	public OrdenPorCategoria() {
		super();
	}


	public OrdenPorCategoria(String unitsOnOrder, String productName, String categoryName) {
		super();
		UnitsOnOrder = unitsOnOrder;
		ProductName = productName;
		CategoryName = categoryName;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getUnitsOnOrder() {
		return UnitsOnOrder;
	}


	public void setUnitsOnOrder(String unitsOnOrder) {
		UnitsOnOrder = unitsOnOrder;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		ProductName = productName;
	}


	public String getCategoryName() {
		return CategoryName;
	}


	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
	
}
