package com.tres.tutorial3;
import javax.swing.*;
public class usoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche Renault=new Coche(); //instance of Coche
		Furgoneta Mack=new Furgoneta();
		Renault.estableceColor(JOptionPane.showInputDialog("¿Cual Es el Color"));
		//System.out.println("El Coche tiene Color " + Renault.dameColor());
		Renault.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		Renault.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene Climatizador"));
		System.out.println(Renault.dimeDatoGenerales()+
				"\n Es de color: "+ Renault.dameColor()+
				"\n Asientos: "+Renault.dimeAsientos()+
				"\n "+ Renault.dimeClimatizador());
		
		System.out.println(Mack.dimeDatoGenerales()+
				"\n Es de color: "+ Mack.dameColor()+
				"\n Asientos: "+Mack.dimeAsientos()+
				"\n "+Mack.dimeClimatizador()+
				"\n Plazas Extra "+Mack.getPlazasExtra()+
				"\n Capacidad de Carga "+Mack.getCapCarga()+
				"\n Peso con carga "+Mack.pesoConCarga());
		
	}
}
