package com.tres.tutorial3;
import java.util.*;
public class Empleado extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private String seccion;
	private int id;
	private static int nextId=1;
	
	public Empleado(String nom) {//Constructor
		this(nom,30000,2000,1,15);
	}
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {//Constructor
		super(nom);
		sueldo=sue;
		seccion = "Administración";
		GregorianCalendar contrato = new GregorianCalendar(agno,mes-1,dia);
		altaContrato=contrato.getTime();
		id=nextId;
		nextId++;
	}
	public static int dameDameNextId() {//getter
		return nextId;
	}
	public String dameSeccion() {//getter
		return seccion;
	}
	public double dameSueldo() {//getter
		return sueldo;
	}
	public Date dameFechaContrato() {//getter
		return altaContrato;
	}
	public int dameId() {//Getter
		return id;
	}
	public void subeSueldo(double porcentaje) {//Setter
		sueldo=sueldo*(1+porcentaje/100);
	}
	public void cambiaSeccion(String seccion){//Setter
		this.seccion=seccion;
	}
	public String dameDescripcion() {
	return "El empleado tiene un ID: "+id;	
	}
}
