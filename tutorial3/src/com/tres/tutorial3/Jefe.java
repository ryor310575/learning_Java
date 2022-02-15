package com.tres.tutorial3;

public class Jefe extends Empleado{
	private double incentivo;
	public Jefe(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	public Jefe(String nom) {
		super( nom);	
	}
	public void estableceIncentivo(double incentivo) {
		this.incentivo=incentivo;
	}
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe+incentivo;
	}

}
