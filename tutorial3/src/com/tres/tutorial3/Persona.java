package com.tres.tutorial3;

public abstract class Persona {
	private final String nombre;
	public Persona(String nom) {
		nombre=nom;
	}
	public String dameNombre() {//getter
		return nombre;
	}
	public abstract String dameDescripcion(); 

}
