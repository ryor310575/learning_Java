package com.tres.tutorial3;

public class Furgoneta extends Coche{
private int capCarga;
private int  plazasExtra;
private int pesoConCarga;

public Furgoneta(int plazasExtra,int capCarga) {
	super();
	this.setCapCarga(capCarga);
	this.setPlazasExtra(plazasExtra);
}
public Furgoneta() {
	this(2,1500);
}
public int getCapCarga() {
	return capCarga;
}
public void setCapCarga(int capCarga) {
	this.capCarga = capCarga;
}
/**
 * @return the plazasExtra
 */
public int getPlazasExtra() {
	return plazasExtra;
}
/**
 * @param plazasExtra the plazasExtra to set
 */
public void setPlazasExtra(int plazasExtra) {
	this.plazasExtra = plazasExtra;
}
public int pesoConCarga() {
	pesoConCarga=capCarga+this.damePesoPlataforma();
	return pesoConCarga;
}


}