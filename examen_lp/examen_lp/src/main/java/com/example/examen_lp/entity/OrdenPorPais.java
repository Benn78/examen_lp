package com.example.examen_lp.entity;

import java.io.Serializable;

public class OrdenPorPais implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int OrderID;
	private String ShipCountry;
	
	public OrdenPorPais() {
		super();
	}

	public OrdenPorPais(int orderID, String shipCountry) {
		super();
		OrderID = orderID;
		ShipCountry = shipCountry;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public String getShipCountry() {
		return ShipCountry;
	}

	public void setShipCountry(String shipCountry) {
		ShipCountry = shipCountry;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
